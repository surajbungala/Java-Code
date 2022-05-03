package String;

import java.util.Scanner;

public class RotationOfString {

    public static boolean rotationOfString(String s1, String s2){

        if(s1.length() != s2.length()){
            return false;
        }

        if((s1 + s1).contains(s2)){
            return true;
        }

        return false;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String strr = sc.nextLine();
        boolean ans = rotationOfString(str, strr);
        System.out.println(ans);
        sc.close();
    }
}
