package Array;

public class SwapAlternate {
    public static void swapAlternate(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n - 1 ; i+=2){
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        int[] arr = {9, 3, 6, 12, 4, 32};
        swapAlternate(arr);
    }
}
