import java.util.Scanner;

public class Fabonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int r = sc.nextInt();

       int factN = 1;
       for(int i = 1; i <= n; i++){
          factN = factN * i;
       }

       int factR = 1;
       for(int i = 1; i <= r; i++){
           factR = factR * i;
       }

       int factRN = 1;
       for(int i = 1; i <= n - r; i++){
           factRN = factRN * i;
       }

       int result = factN / (factR * factRN);
       System.out.println(result);

      sc.close();
    }
}
