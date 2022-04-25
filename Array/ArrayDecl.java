package Array;

/**
 * ArrayDecl
 */
public class ArrayDecl {
   public static void main(String[] args) {
       int arr[] = new int[10];
       arr[1] = 10;
       arr[3] = 20;
       System.out.println(arr[1]);
       System.out.println(arr[3]);
       System.out.println(arr[8]);

       char[] name = new char[10];
       System.out.println(name[0]);

       double[] value = new double[10];
       System.out.println(value[2]);
   }
    
}