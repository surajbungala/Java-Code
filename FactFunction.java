import java.util.Scanner;

public class FactFunction {

    public static int fact(int num) {
        int fact = 1;
        for(int i = 1; i <= num; i++){
            fact = fact * i;
        }
        return fact;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int factN = fact(n);
        int factR = fact(r);
        int factNR = fact(n - r);

        int result = factN / (factR * factNR);
        System.out.println(result);
        sc.close();
    }
}
