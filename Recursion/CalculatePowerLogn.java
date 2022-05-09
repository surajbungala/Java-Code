package Recursion;

import java.util.Scanner;

public class CalculatePowerLogn {

    public static int calcPowerLog(int x, int n){

        //base case

        if(n == 0){
            return 1;
        }

        if(x == 0){
            return 0;
        }

        if(n % 2 == 0){
            int cal_ans = calcPowerLog(x, n/2) * calcPowerLog(x, n/2);
            return cal_ans;
        }else{
            int ans_cal = calcPowerLog(x, n/2) * calcPowerLog(x, n/2) * x;
            return ans_cal;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Value of x : ");
        int x = sc.nextInt();

        System.out.print("Value of n : ");
        int n = sc.nextInt();

        int ans = calcPowerLog(x, n);
        System.out.print("Power ans : " + ans);
        sc.close();

    }
}
