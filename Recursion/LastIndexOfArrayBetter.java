package Recursion;

public class LastIndexOfArrayBetter {

    public static int Last_Index(int a[], int x, int si){

        // base case

        if(si == a.length){
            return -1;
        }

        int last_index = Last_Index(a, x, si + 1);
        if(last_index != -1){
            return last_index;
        }else{
            if(a[si] == x){
                return si;
            }else{
                return -1;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int ele = 1;
        int si = 0;
        int First_Index = Last_Index(arr, ele, si);
        System.out.println(First_Index); 
    }
}
