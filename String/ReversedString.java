package String;

import java.util.Scanner;

public class ReversedString {

    //private static String st;
    public static String reversedString(String str){
       // String stt = str.length();
       int stt = str.length();
        String reverseString = " ";
        for(int i = stt - 1; i >= 0; i--){
            reverseString += str.charAt(i);
        }
        return reverseString;
    }
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       String reverseString = reversedString(str);
       System.out.println(reverseString);
       sc.close();
   } 
}
