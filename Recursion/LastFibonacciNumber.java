package Recursion;

import java.util.Scanner;

public class LastFibonacciNumber {

    public static int lastFibonacci(int n){

        //base case

        if(n == 1 || n == 2){
            return 1;
        }

        int fibo_num1 = lastFibonacci(n - 1);
        int fibo_num2 = lastFibonacci(n - 2);
        int fibo_ans = fibo_num1 + fibo_num2;
        return fibo_ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = lastFibonacci(n);
        System.out.println(ans);
        sc.close();
    }
}
