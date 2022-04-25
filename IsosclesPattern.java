import java.util.Scanner;

public class IsosclesPattern {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int i = 1;
        while(i <= n){
            int spaces = 1;
            while(spaces <= n - i + 1){
                System.out.print(" ");
                spaces = spaces + 1;
            }
            int incrs = 1;
            while(incrs <= i){
                System.out.print(incrs);
                incrs = incrs + 1;
            }

            int dec = i - 1;
            while(dec >= 1){
                System.out.print(dec);
                dec = dec - 1;
            }
            System.out.println();
            i = i + 1;
        }
        sc.close();
       
    }
    
}
