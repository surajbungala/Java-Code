package Array;

import java.util.Scanner;

public class LargestNumberOfArray {

    public static int largestNumber(int[] arr){
       int max = Integer.MIN_VALUE;
       for(int i = 0; i < arr.length; i++){
           if(arr[i] > max){
               max = arr[i];
           }

       }
       return max;
    }

    public static int[] takeInput(){
        System.out.println("Enter array size index :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("Array index at" + " " + i + "th index" );
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }
    
    public static void main(String[] args) {
        int[] arr = takeInput();
        int large = largestNumber(arr);
        System.out.println(large);
    }
}
