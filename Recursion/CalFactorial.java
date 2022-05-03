package Recursion;

public class CalFactorial {

    public static int calculateFacti(int n){

        // base case
        if(n == 1){
            return 1;
        }

        int fact_num = calculateFacti(n - 1);
        int num_fact = n * fact_num;
        return num_fact;
    }
    public static void main(String[] args) {
        int calci_fact = calculateFacti(5);
        System.out.println(calci_fact);
    }
}
