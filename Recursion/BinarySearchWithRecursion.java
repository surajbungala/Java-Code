package Recursion;

public class BinarySearchWithRecursion {

    public static int binarySearch(int a[], int si, int ei, int x){
        //base case

        if(si > ei){
            return -1;
        }

        int midIndex = (si + ei)/2;
        //if x found in middle of array
        if(a[midIndex] == x){
            return midIndex;
        }
        //if mid element is less than search element
        else if(a[midIndex] < x){
            return binarySearch(a, midIndex + 1, ei, x);
        }else{
            return binarySearch(a, midIndex - 1, ei, x);
        }
    }
    public static void main(String[] args) {
        int a[] = {1, 3, 5, 6, 8, 9};
        int searched = binarySearch(a, 0, a.length - 1, 8);
        System.out.println(searched);
    }
}
