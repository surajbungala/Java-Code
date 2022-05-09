package Recursion;

public class ArrayIsSorted {

    public static boolean isSorted(int a[]){
        if(a.length == 1){
            return true;
        }

        if(a[0] > a[1]){
            return false;
        }
// array copies into new array
        int arr[] = new int[a.length - 1];
        for(int i = 1; i < a.length; i++){
        arr[i - 1] = a[i];
        }

        boolean arraySorted = isSorted(arr);
        return arraySorted;
    }
    public static void main(String[] args) {
        int ar[] = {1, 2, 3, 4, 5};
        boolean ans = isSorted(ar);
        System.out.println(ans);
    }
}
