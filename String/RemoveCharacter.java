package String;

import java.util.Scanner;

public class RemoveCharacter {

    public static String removeCharacter(String str, char c){
        String ans = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != c){
                ans += str.charAt(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);
        String st = removeCharacter(str, ch);
        System.out.println(st);
        sc.close();
    }
}
