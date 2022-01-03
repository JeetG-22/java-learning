package array;

public class Test {

	public static void main(String[] args) {
		String line = "CONNECTICUT - CT";
		//line = smallestChar(line);
		//System.out.println(passort(line));
		line = line.replaceAll("[^a-zA-Z0-9]", "");
		int i = passort(line);
		System.out.println(i);
	}
    public static boolean isSorted(String word){
        for(int i = 0; i < word.length()-1; i++){
            if(word.charAt(i) > word.charAt(i+1)){
                return false;
            }
        }
        return true;
    }
    public static String smallestChar(String line){
        int index = -1;
        boolean check = false;
        for(int i = 0; i < line.length()-1;i++){
            for(int j = i+1; j < line.length(); j++){ //Finding the first char thats out of order
                if(line.charAt(i) > line.charAt(j)){
                    check = true;
                    break;
                }
            }
            if(check){
                index = i;
                break;
            }
        }
        int minI = line.length()-1, min = line.charAt(line.length()-1);
        for(int i = line.length()-2; i > index; i--){ //Finding first occurence
            if(min >= line.charAt(i) && line.charAt(i) < line.charAt(index)){
                min = line.charAt(i);
                minI = i;
            }
        }
        char[] arr = line.toCharArray();
        int temp = arr[index];
        arr[index] = arr[minI];
        arr[minI] = (char)temp;
        return new String(arr);
        
    }
    public static String largestChar(String line){
        int index = -1;
        boolean check = false;
        for(int i = line.length()-1; i >= 1;i--){
            for(int j = i-1; j >= 0; j--){ //Finding the first char thats out of order
                if(line.charAt(i) < line.charAt(j)){
                    check = true;
                    break;
                }
            }
            if(check){
                index = i;
                break;
            }
        }
        int maxI = 0, max = line.charAt(0);
        for(int i = 1; i<index; i++){ //Finding first occurence
            if(max <= line.charAt(i) && line.charAt(i) > line.charAt(index)){
                max = line.charAt(i);
                maxI = i;
            }
        }
        char[] arr = line.toCharArray();
        int temp = arr[index];
        arr[index] = arr[maxI];
        arr[maxI] = (char)temp;
        return new String(arr);
        
    }
    public static int passort(String line) {
        int count = 0;
        int i = 1, index = 0;
        //line = line.replaceAll("[^a-zA-Z0-9]", "");
        while(!isSorted(line)){
            if(i % 2 != 0){
                line = smallestChar(line);
                count++;
            }
            else{
                line = largestChar(line);
                count++;
            }
            i++;
            System.out.println(line);
        }
        return count;
    }

}


