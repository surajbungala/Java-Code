package Recursion;

public class QuickSortRecursion {

    public static int partition(int a[], int si, int ei){
        int pivotElement = a[si];
        //pivotIndex 
        int count = 0;
        for(int i = si + 1; i <= ei; i++){
            if(a[i] < pivotElement){
                count++;
            }
        }
            int pivotIndex = si + count;
            a[si] = a[pivotIndex];
            a[pivotIndex] = pivotElement;
            /*
            int temp = a[si + count];
            a[si + count] = pivotElement;
            a[si] = temp;
            */
      //for to check and swap element in if right element is less than left element
      //  of pivotElement in array
        int i = si;
        int j = ei;

        while(i < j){
            if(a[i] < pivotElement){
                i++;
            }else if(a[j] >= pivotElement){
                 j--;
            }else{
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        return si + count;
    }

    public static void quickSort(int a[], int si, int ei){
        //base case
        if(si >= ei){
            return;
        }

        int pivotIndex = partition(a, si, ei);
        quickSort(a, si, pivotIndex - 1);  //left side of pivot element
        quickSort(a, pivotIndex + 1, ei); // right side of pivot element 
    }
    public static void main(String[] args) {
        int a[] = {10, 4, 5, 9, 8, 6, 12, 11, 7};
        quickSort(a, 0, a.length - 1);
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
        System.out.println();
    }
}
