import java.util.Scanner;

public class StarMirrorPattern {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();

         int i = 1;
         while(i <= n){
             int spaces = 1;
             while(spaces <= n - i){
                 System.out.print(" ");
                 spaces = spaces + 1;
             }

             int j = 1;
             while(j <= i){
                 System.out.print("*");
                 j = j + 1;
             }
             System.out.println();
             i = i + 1;
         }
         sc.close();
    }
}
