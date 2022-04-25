package Array;

public class BinarySearch {

    public static int binarySearch(int[] arr, int element){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = ( start + end ) / 2;
            if(arr[mid] > element){
                end = mid - 1; 
            }
            else if(arr[mid] < element){
                start = mid  + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 7, 9, 10};
        int index = binarySearch(arr, 7);
        System.out.println("Index" + " " +index);
    }
}
