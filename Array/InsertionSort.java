package Array;

public class InsertionSort {

    public static void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    }

    public static void insertionSort(int[] arr){
        int n = arr.length;
         for(int i = 1; i < n; i++){
             // array index of i = 1 
            //  array index of j = i - 1 => j = 1 -1 => j = 0 
             int j = i - 1;
             int temp = arr[i];
             while(j >= 0 && arr[j] > temp){
                 arr[j + 1] = arr[j];
                 j--;
             }
             arr[j + 1] = temp;
         }
    }
    public static void main(String[] args) {
       int[] arr = {2, 5, 7, 8, 1, 6};
        insertionSort(arr);
        printArray(arr);
    }
}
