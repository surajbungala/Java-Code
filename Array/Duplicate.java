package Array;

public class Duplicate {

    public static int duplicateNumber(int arr[]) {
    	//Your code goes here
         int ans=0,count=0;
        for(int i=0;i<arr.length;i++){
            count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j])
                    count++;
                if(count>=2)
                {
                    ans=arr[i];
                    break;
                }
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 3, 1};
       int dup = duplicateNumber(arr);
        System.out.println(dup);
    }
}
