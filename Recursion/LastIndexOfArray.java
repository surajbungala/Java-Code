package Recursion;

public class LastIndexOfArray {

    public static int Last_Index(int a[], int x){

        // base case

        if(a.length == 0){
            return -1;
        }

        int arr[] = new int[a.length - 1];
        for(int i = 1; i < a.length; i++){
            arr[i - 1] = a[i];
        }

        int last_index = Last_Index(arr, x);
        if(last_index != -1){
            return last_index + 1;
        }else{
            if(a[0] == x){
                return 0;
            }else{
                return -1;
            }
        }

    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int ele = 5;
       // int si = 0;
        int First_Index = Last_Index(arr, ele);
        System.out.println(First_Index);
    }
}
