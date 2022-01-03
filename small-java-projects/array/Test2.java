package array;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		String word = "rewriting";
		syllables(word);
	}
    public static String containsPrefixOrSuffix(String[] arr, String word){
        for(int i = 0; i < arr.length; i++){
            if(word.contains(arr[i])){
                return arr[i];
            }
        }
        return null;
    }

    public static int syllables(String word) {
        String[] comboCon = {"ch", "ck", "ph", "sh", "th", "wh", "wr"};
        String[] prefix = {"co", "de", "dis", "pre", "re", "un"};
        String[] suffix = {"age", "ful", "ing", "less", "ment"};
        ArrayList<Character> newWord = new ArrayList<Character>();
        for(int i = 0; i < word.length(); i++){
            newWord.add(word.charAt(i));
        }
        if(containsPrefixOrSuffix(prefix, word) != null){ //Prefix Check
            String pref = containsPrefixOrSuffix(prefix,word);
            newWord.add(pref.length(), '|');
        }
        if(containsPrefixOrSuffix(suffix, word) != null){ //Suffix Check
            String suff = containsPrefixOrSuffix(suffix,word);
            newWord.add((word.length()-suff.length() + 1), '|');
        }
        printOut(newWord);
        return -1;
    }
    public static void printOut(ArrayList<Character> c) {
    	for(int i = 0; i < c.size(); i++) {
    		System.out.print(c.get(i) + "\t");
    	}
    }
}
