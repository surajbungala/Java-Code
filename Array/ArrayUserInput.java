package Array;

import java.util.Scanner;

public class ArrayUserInput {
    public static void main(String[] args) {
        System.out.println("Number of index you want store in an array ?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("Array at" + " " + i + " " +"th index");
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            System.out.print(arr[i]);
        }
        sc.close();
    }
}
