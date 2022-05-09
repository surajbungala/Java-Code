package Recursion;

public class FirstIndexOfArray {

    public static int first_Index(int a[], int x){
        // base case
       // element not present in array return -1
        if(a.length == 0){
            return -1;
        }
      // element is present in first index return 0 
        if(a[0] == x){
            return 0;
        }
//copying in new array
        int arr[] = new int[a.length - 1];
        for(int i = 1; i < a.length; i++){
            arr[i -1] = a[i];
        }
        int fi = first_Index(arr, x);
        if(fi == -1){
            return -1;
        }else{
            return fi + 1;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int ele = 2;
        int First_Index = first_Index(arr, ele);
        System.out.println(First_Index);
    }
}
