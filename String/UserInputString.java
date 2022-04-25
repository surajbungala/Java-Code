package String;

import java.util.Scanner;

public class UserInputString {

    public static void printString(String str){
        int st = str.length();
        for(int i = 0; i < st; i++){
            System.out.println(str.charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String str = sc.nextLine();
        printString(str);
        sc.close();
    }
}
