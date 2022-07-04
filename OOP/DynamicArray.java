package OOP;
class DynamicArrays{
    private int arr[];
    private int size;
    private int count;

    public DynamicArrays(){
        this.size = 1;
        this.arr = new int[size];
        this.count = 0;
    }

    public void insert(int value){
        CheckAndGrow();
        arr[count] = value;
        count++;
    }

    public void display(){
        for(int i : arr){
            System.out.println(i + " ");
        }
    }

    private void CheckAndGrow(){
        if(this.size == this.count){
            //create new array and double in size of previous array
            int tempArr[] = new int[size * 2];
            for(int i = 0; i < count; i++){
                //copying of previous array elements in new array(tempArr)
                tempArr[i] = arr[i]; 
            }
            arr = tempArr;
            size = size * 2;
        }
    }
}
public class DynamicArray {
    public static void main(String[] args) {
        DynamicArrays d = new DynamicArrays();
        d.insert(5);
        d.insert(6);
        d.insert(7);
        d.insert(10);
        d.display();
    }
}
