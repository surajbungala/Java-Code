package OOPs;
class Trans{
    int maxSpeed = 120;
    public void msg(){
        System.out.println("This is message from Transport class");
    }
}

class JCB extends Trans{
    int maxSpeed = 180;

    public void msg(){
        System.out.println("This is Truck class");
    }
    // Note that print() is only in Truck class
    public void print(){

        //maxSpeed invoked or call from parent class with super keyword
        System.out.println("MaxSpeed " + super.maxSpeed);

        //will invoked or call parent class msg() method
        super.msg();

        //will invoked or call  child class msg() method
        msg();
       
    }



}
public class SuperKeyword_1 {
    public static void main(String[] args) {
        JCB cr = new JCB();
        cr.print();
    }
}
