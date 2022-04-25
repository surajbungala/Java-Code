package Array2d;

import java.util.Scanner;

public class InputTwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows :");
        int rows = sc.nextInt();
        System.out.println("Enter the column :");
        int col = sc.nextInt();

        int[][] arr = new int[rows][col];
    // taking input array from user
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < col; j++){
                System.out.println("Enter the element at "+  i +  " row " +  j +" column");
                arr[i][j] = sc.nextInt(); //taking input
            }
        }
  // printing an array 
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < col; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
sc.close();
    }
}
