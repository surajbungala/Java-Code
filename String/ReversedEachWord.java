package String;

import java.util.Scanner;

public class ReversedEachWord {

    public static String reversedEachWord(String str){
        String reversed = "";
        int currentWordStart = 0;
        int i = 0;
        for(; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                String rev = "";
                int currentWordEnd = i - 1;
                for(int j = currentWordStart; j <= currentWordEnd; j++){
                    rev = str.charAt(j) + rev;
                }
                reversed += rev + " ";
                currentWordStart = i + 1;
            }
        }
                String rev = "";
                int currentWordEnd = i - 1;
                for(int j = currentWordStart; j <= currentWordEnd; j++){
                    rev = str.charAt(j) + rev;
                }
                reversed += rev;
         
        return reversed;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String st = reversedEachWord(str);
        System.out.println(st);
        sc.close();
    }
}
