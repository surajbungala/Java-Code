package String;

import java.util.Scanner;

public class NewPatternReverseString {

    public static String reversedString(String str){
        int stt = str.length();
        String reverseString = " ";
        
        for(int i = 0; i < stt; i++){
            reverseString = str.charAt(i) + reverseString;
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
