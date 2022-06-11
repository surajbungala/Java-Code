package OOPs;

class Students{
    String name;
    private int rollNumber;

    //create a constructor
    //parameterized constructor
    public Students(String n, int roll){
        name = n;
        rollNumber = roll;
    }
    //single parameterized constructor
    public Students(String n){
        name = n;
    }

    public void print(){
        System.out.println(name + " " + rollNumber);
    }
// getter
    public int getRollNumber(){
        return rollNumber;
    }

//setter for set the value 
    public void setRollNumber(int rollNumber){
        if(rollNumber <= 10){
            return;
        }

        this.rollNumber = rollNumber;
    }

}

public class Constructors {
    public static void main(String[] args) {
        Students st = new Students("Alex", 25);
        //st.name = "Alex";
        //st.setRollNumber(20);
        st.print();

        Students st1 = new Students("Kristy", 5);
        //st1.name = "Tori";
        //st1.setRollNumber(12);
        st1.print();

        Students st2 = new Students("Tori");
        st2.print();
         //System.out.println(st.name + " " + st.getRollNumber());
        //System.out.println(st1.name + " " + st1.getRollNumber());
        //System.out.println(st2.name);

    }
}
