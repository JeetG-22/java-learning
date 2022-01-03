import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args){
        char[] arr = {'Z','e','l','l','o'};
        int n = arr.length;
        for(int i = 0; i < n/2; i++){
            char temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-1-i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void rArray(){
        char[] arr = {'h','e','l','l','o'};
        char[] temp = new char[arr.length];
        int j = 0;
        for(int i = arr.length - 1; i >= 0; i--){
            temp[j] = arr[i];
            j++;
        }
        arr = temp;
        System.out.println(Arrays.toString(arr));
    }
}
