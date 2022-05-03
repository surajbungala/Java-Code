package Recursion;

public class DecreasingOrder {

    public static void printNumbers(int n){

        //base case

        if(n == 0){
            return;
        }

        System.out.println(n);
        printNumbers(n - 1);
    }
    public static void main(String[] args) {
        int n = 5;
        printNumbers(n);
    }
}
