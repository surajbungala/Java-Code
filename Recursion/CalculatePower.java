package Recursion;

import java.util.Scanner;

public class CalculatePower {

    public static int calcPower(int x, int n){
        
        //base case

        if(n == 0){
            return 1;
        }

        if(x == 0){
            return 0;
        }

        int calc_Power = calcPower(x, n - 1);
        int power_Calc = x * calc_Power;
        return power_Calc;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Value of x : ");
       int x = sc.nextInt(); 

       System.out.print("Value of n : ");
       int n = sc.nextInt();

       int ans = calcPower(x, n);
       System.out.println("Power of x : " + ans);
       sc.close();
    }
}
