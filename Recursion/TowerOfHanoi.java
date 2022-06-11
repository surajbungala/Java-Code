package Recursion;

public class TowerOfHanoi {
    public static void towerOfHanoi(int n, String source, String help, String dest ){
        
        //base case
        if(n == 1){
            System.out.println("Transfer disk " + n + " from " + source + " to " + dest);
            return;
        }
        towerOfHanoi(n-1, source, dest, help);
        System.out.println("Transfer disk " + n + " from " + source + " to " + dest);
        towerOfHanoi(n-1, help, source, dest);
    }
    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n, "Source", "Helper", "Destination");
    }
}
