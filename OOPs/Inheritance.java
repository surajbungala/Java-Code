package OOPs;

class Vehicle{
    private String color;
    int maxSpeed = 200;
    
    //getter function for color
    public String getColor(){
        return color;
    }
  //setter function
    public void setColor(String color){
        this.color = color;
    } 

    public void print(){
        System.out.println("Color " + color + " maxSpeed " + maxSpeed);
    }
}
//private member of base class cannot directly access in derived classes 
//you can create a getter and setter function in base class 
//access private member by indirectly in derived class
 class Cars extends Vehicle{
   int numDoors;


   public void print(){
    System.out.println("Car " + "Color " + getColor() + " numDoors " + numDoors + " maxSpeed " + maxSpeed);
   }
   
   /* 
   public void printCar(){
    System.out.println("Car " + "Color " + getColor() + " numDoors " + numDoors + " maxSpeed " + maxSpeed);
   }
   */
 }

 class Bicycle extends Vehicle{
    int gear;

    public void printByc(){
        System.out.println("Bicycle " + " Color " + getColor() + " gear " + gear + " maxSpeed " + maxSpeed );
    }
 }

public class Inheritance {
    public static void main(String[] args) {
        
        Vehicle veh = new Vehicle();
        //veh.Color = "Black";
        veh.setColor("Marron");
        veh.print();

        Cars car = new Cars();
        //car.color = "Red";
        //color set for car class object
        car.setColor("Green");
        car.maxSpeed = 300;
        car.numDoors = 4;
        car.print();
        //car.printCar();

        Bicycle byc = new Bicycle();
        //byc.color = "Silver";
        //color set for bicycle class object
        byc.setColor("Dark Black");
        byc.gear = 21;
        byc.maxSpeed = 30;
       // byc.printByc();

    }
}
