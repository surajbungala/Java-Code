package String;

import java.util.Scanner;

public class StrringInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        String str = sc.nextLine();
        System.out.println(a + " " + str + " " + str.length() );
        sc.close();
    }
}
