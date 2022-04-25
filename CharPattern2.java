import java.util.Scanner;

public class CharPattern2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         int i = 1;
         while(i <= n){
             int j = 1;
            
             while(j <= n){
                char nthChar = (char)('A' + i + j - 2);
                 System.out.print(nthChar);
                 j = j + 1;
             }
             System.out.println();
             i = i + 1;
         }
         sc.close();
    }
}
