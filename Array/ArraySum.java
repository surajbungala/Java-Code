package Array;

import java.util.Scanner;

public class ArraySum {
    public static void arraySum(int[] arr){
        int ans = 0;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            ans += arr[i];
            System.out.println(ans);
        }
    }
  
    public static int[] takeInput(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int[] arr = new int[n];

         for(int i = 0; i < n; i++){
             System.out.println("Array index" +" "+ i + " " + "th index");
             arr[i] = sc.nextInt();
         }
         sc.close();
         return arr;
    }

    public static void main(String[] args) {
       int[] arr = takeInput();
       arraySum(arr);

    }
}
