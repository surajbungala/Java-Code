public class Solutiion {
    public static int countZerosRec(int input){
		// Write your code here
        if(input==0) {
			return 0;
		}
		int temp= countZerosRec(input/10);
		if(input % 10 == 0) {
			return temp +1;
		}
		return temp;
	}
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10204;
		System.out.println(countZerosRec(n));

	}
}

