package String;

import java.util.Scanner;

public class ReversedWordWise {

    public static String reverseWordWise(String str) {
		// Write your code here
        
		String x="";
		int space=str.length();
		for(int i=str.length()-1;i>=0;i--) {
			
			if(i==0) {
				x=x+str.substring(0,space);
			}
			
			else if(str.charAt(i)==' ') {
				x=x+str.substring(i+1,space)+" ";
				space=i;
			}
		}
		return x;
		
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str  = sc.nextLine();
        String st = reverseWordWise(str);
        System.out.println(st);
        sc.close();
        
    }
}
