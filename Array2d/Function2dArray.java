package Array2d;

import java.util.Scanner;

public class Function2dArray {
    public static void printArray(int[][] arr){
        int rows = arr.length;
        int cols = arr[0].length;
        for(int i= 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows :");
        int rows = sc.nextInt();
        System.out.println("Enter the columns :");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.println("Enter the elements at " + i + " row " + j + " column");
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        return arr;
        
    }
    public static void main(String[] args) {
        int[][] input = takeInput();
        printArray(input);
    }
}
