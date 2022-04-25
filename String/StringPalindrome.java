package String;

import java.util.Scanner;

public class StringPalindrome {

    public static boolean isStringPalindrome(String str){
         int i = 0;
         int j = str.length() - 1;

         while(i < j){
             if(str.charAt(i) != str.charAt(j)){
                 return false;
             }
             else{
                 i++;
                 j--;
             }
         }
         return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean palinDrome = isStringPalindrome(str);
        System.out.println(palinDrome);
        sc.close();
    }
}
