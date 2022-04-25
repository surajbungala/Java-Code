import java.util.Scanner;

public class ReturnStatement {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int div = 2;
      
            while(div <= n-1){
                if(n % div == 0){
                    System.out.println("Composite");
                    return;
                }
                div = div + 1;
            }
            System.out.println("Prime");
     sc.close();
        }
    }
    
}
