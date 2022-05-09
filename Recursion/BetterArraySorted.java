package Recursion;


public class BetterArraySorted {

    public static boolean betterArraySorted(int a[], int si){
        //base case
        if(si == a.length){
            return true;
        }

        if(a[si] > a[si + 1]){
            return false;
        }

        boolean betterSorted = betterArraySorted(a, si + 1);
        return betterSorted;
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4};
        int x = 4;
        boolean ans = betterArraySorted(arr, x);
        System.out.println(ans);
    }
}
