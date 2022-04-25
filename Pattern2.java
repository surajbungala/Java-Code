import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int i= 1;
        int p = 1;
        while(i <= n){
            int j = 1;
            while(j <= i){
                System.out.print(p);
                j = j + 1;
                p = p + 1;
            }
            System.out.println();
            i = i + 1;
        }
        sc.close();
    }
}
