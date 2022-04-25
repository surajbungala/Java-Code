package Array2d;

import java.util.Scanner;

public class LargestRoworColSum {

    public static int[][] takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows :");
        int rows = sc.nextInt();
        System.out.println("Enter cols :");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.err.println("Enter the elements " + i +" rows " + j + " cols");
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        return arr;
    }

    public static int largestColorRowSum(int[][] arr){
        int rows = arr.length;
        int cols = arr[0].length;
        
        int largest = Integer.MIN_VALUE;

        for(int j = 0; j < cols; j++){
            int sum = 0;
            for(int i = 0; i < rows; i++){
                sum += arr[i][j];
            }

            if(sum > largest){
                largest = sum;
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int[][] input = takeInput();
        int colSum = largestColorRowSum(input);
        System.out.println(colSum);
    }
}
