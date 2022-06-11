package Recursion;

public class LastIndexQuickSortRecursion {

    public static int partition(int a[], int si, int ei){
        //taking last element as a pivot
        int pivotElement = a[ei];
        int i = si - 1;//index of smaller element 
        //(if return -1 means there is no elements less than pivot)

        for(int j = si; j < ei; j++){
            if(a[j] <= pivotElement){
               i++;
               //swap a[i] and a[j]
               int temp = a[i];
               a[i] = a[j];
               a[j] = temp;
            }
        }

        //swap a[i + 1] and a[ei](pivot)
        //i++;
        int temp = a[i + 1];
        a[i + 1] = a[ei];
        a[ei] = temp;

        return i + 1;
    }

    public static void quickSort(int a[], int si, int ei){
        //base case

        if(si < ei){

        int pivotIndex = partition(a, si, ei);
        quickSort(a, si, pivotIndex - 1 );
        quickSort(a, pivotIndex + 1, ei);
        }

       
    }
    public static void main(String[] args) {
        int a[] = {10, 9, 8, 6, 5, 12, 11, 7};
        quickSort(a, 0, a.length - 1);
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
