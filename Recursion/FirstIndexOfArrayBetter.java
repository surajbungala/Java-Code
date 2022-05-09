package Recursion;

public class FirstIndexOfArrayBetter {
   
    public static int First_Index(int a[], int x, int si){
        // base case

        if(si == a.length){
            return -1;
        }
         if(a[si] == x){
             return si;
         }

         int ans = First_Index(a, x, si + 1);
         return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int ele = 1;
        int si = 0;
        int First_Index = First_Index(arr, ele, si);
        System.out.println(First_Index);
    }
}
