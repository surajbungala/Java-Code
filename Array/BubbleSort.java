package Array;

public class BubbleSort {

    public static void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    }

    public static void bubbleSort(int[] arr){
        int n = arr.length;
         // for n-1 iteration
         for(int i = 0; i < n-1; i++){
   //i = 1, 2, 3, 4  ----  j = n-i-1
            for(int j = 0; j < n-1-i; j++){
                if(arr[j] > arr[j + 1]){
                    //swapping numbers
                    int temp = arr[j];
                    arr[j] = arr[j  + 1];
                    arr[j + 1] = temp;
                }
            }
         }
    }
    public static void main(String[] args) {
        int[] arr = {1, 7, 4, 2, 3, 8, 6};
        bubbleSort(arr);
        printArray(arr);
    }
}
