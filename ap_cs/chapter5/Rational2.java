package chapter5;

import java.text.DecimalFormat;

public class Rational2 {
	private int p,q;
	private boolean defined;
	DecimalFormat df = new DecimalFormat("#.####");
	
	public Rational2() {
		p = 1;
		q = 1;
		defined = true;
	}
	public Rational2(int n, int d) {
		if(d == 0) {
			defined = false;
		}
		else {
			defined = true;
			if(n < 0 || d < 0) {
				p = -1 * Math.abs(n);
				q = Math.abs(d);
			}
			else {
				p = Math.abs(n);
				q = Math.abs(d);
			}
		}
	}
	public Rational2(double d) {
		defined = true;
		d = Double.parseDouble(df.format(d));
		deciToFrac(Math.abs(d));
		if(d < 0) {
			reduce();
			p *= -1;
		}
		else {
			reduce();
		}
	}
	public void setP(int newP) {
		p = newP;
	}
	public void setQ(int newQ) {
		q = newQ;
		if(q != 0) {
			defined = false;
		}
		else {
			defined = true;
		}
	}
	public int getP() {
		return p;
	}
	public int getQ() {
		return q;
	}
	public boolean isDefined() {
		return defined;
	}
	public double decimalValue() {
		return (double)p / q;
	}
	public void deciToFrac(double num) {
		int count = 0;
		while(num - (int)num > .00001) {
			num = num*10;
			count++;
		}
		p = (int)num;
		q = (int)Math.pow(10, count);
	}
	public void reduce() {
		int gcf = this.gcf(p,q);
		q = q / gcf;
		p = p / gcf;
	}
	public int gcf(int num, int denom) {
		for(int i = Math.min(num, denom); i > 0; i--) {
			if(num % i == 0 && denom % i == 0) {
				return i;
			}
		}
		return 1;
	}
	public Rational2 add(Rational2 r) {
		int num = (p * r.getQ())+(r.getP() * q);
		int denom = q * r.getQ();
		int numerator = num / gcf(num,denom);
		int denominator = denom / gcf(num,denom);
		return new Rational2(numerator,denominator);
	}
	public Rational2 subtract(Rational2 r) {
		int num = (p * r.getQ())-(r.getP() * q);
		int denom = q * r.getQ();
		int numerator = num / gcf(num,denom);
		int denominator = denom / gcf(num,denom);
		return new Rational2(numerator,denominator);
	}
	public Rational2 multiply(Rational2 r) {
		int num = p * r.getP();
		int denom = q * r.getQ();
		int numerator = num / gcf(num,denom);
		int denominator = denom / gcf(num,denom);
		return new Rational2(numerator,denominator);
	}
	public Rational2 divide(Rational2 r) {
		int num = p * r.getQ();
		int denom = q * r.getP();
		int numerator = num / gcf(num,denom);
		int denominator = denom / gcf(num,denom);
		return new Rational2(numerator,denominator);
	}
	public boolean equals(Rational2 r) {
		return Math.abs(p - r.getP()) < .01 && Math.abs(q - r.getQ()) < .01;
	}
	public String toString() {
		if(defined) {
			return p + "/" + q;
		}
		return "Error! Division by zero!";
	}
}
