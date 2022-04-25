package Array2d;

import java.util.Scanner;

public class RowwiseSum {

    public static void printArray(int[][] arr){
        int rows = arr.length;
        int cols = arr[0].length;
        if(rows== 0){
            return;
        }
        for(int i = 0; i < rows; i++){
            int nRows = 0;
            for(int j = 0; j < cols; j++){
                System.out.print(arr[i][j] + " ");
                nRows += arr[i][j]; 
            }
            System.out.println("= " + nRows + " ");
        }
    }

    public static int[][] rowWiseSum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows :");
        int rows = sc.nextInt();
        System.out.println("Enter the cols :");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
              System.out.println("Enter the elements " + i + " rows " + j + " columns ");
              arr[i][j] = sc.nextInt();
        }
    }
    sc.close();
    return arr;
}
    public static void main(String[] args) {
        int[][] input = rowWiseSum();
        printArray(input);
    }
}
