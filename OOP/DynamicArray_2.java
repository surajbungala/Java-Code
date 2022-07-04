package OOP;
class dynamicArray{
 private int data[];
 //track at which index element shall go
 private int nextElementIndex;

 //Constructor

 public dynamicArray(){
    data = new int[5];
//if the array is empty then the first element goes into 0th index
    nextElementIndex = 0;
 }

 public int size(){
    return nextElementIndex;
 }

 public boolean isEmpty(){
    //if it is zero return true and if it is not return false
    return nextElementIndex == 0; //if nextElementIndex is 0 then the array is empty
    //if nextElementIndex is some +ve number then it is not empty
 }

 public int getElem(int i){
    if(i >= nextElementIndex){
        return -1; // dont have empty array index
    }
    return data[i];
 }

 public void add(int elem){
    if(nextElementIndex == data.length){
        doubleCapacity();
    }
    data[nextElementIndex] = elem;
    nextElementIndex++;
 }

  public void doubleCapacity(){
    int temp[] = data; //storing previous array in temp
    data = new int[2 * temp.length]; // data is point to a new array

    for(int i = 0; i < temp.length; i++){
        data[i] = temp[i];
    }
  }

  public void setElem(int i, int elem){
    if(i >= nextElementIndex){
        //Error
        return;
    }
    data[i] = elem;
  }

  public int removeLast(){

    if(nextElementIndex == 0){
        //Error
        return -1;
    }
    int temp = data[nextElementIndex - 1];
    data[nextElementIndex - 1] = 0;
    nextElementIndex--;
    return temp;
  }
}
public class DynamicArray_2 {
    public static void main(String[] args) {
        dynamicArray da = new dynamicArray();

        for(int i = 1; i < 100; i++){
            da.add(100 + i); // insert new element after 100th
        }
    //count the element user has inserted so far
        System.out.println(da.size()); 
    //read the value at particular index ex. data[2] read the value at index 2
        System.out.println(da.getElem(2));
    //replace the previous value to the current value
        da.setElem(3,170);
        System.out.println(da.getElem(3));

        while(! da.isEmpty()){
    //remove the last element decrease index by 1
            System.out.println(da.removeLast());
            System.out.println("size " + " -" + da.size());
        }
    }
}
