package OOPs;



class Pen{
    String name;
    String color;
    private int price;
//getter retun value
    public int getPrice(){
        return price;
    }
//setter set the value 
    public void setPrice(int price){
        if(price <= 10){
            return;
        }
          System.out.println("this " + this);
          //this keyword refernce to the current object of the class
            this.price = price;
        
        
    }

    
}

public class OOPs {
    public static void main(String[] args) {
    
        Pen pen = new Pen();
        pen.name = "Natraj";
        pen.color = "Red";
        System.out.println("pen " + pen);
        pen.setPrice(5);
        
        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen2.name = "Luxor";
        System.out.println("pen2 " + pen2);
        pen2.setPrice(25);

        System.out.println(pen.name + " " + pen.color + " " + pen.getPrice());
        System.out.println(pen2.name + " " + pen2.color + " " + pen2.getPrice());

        
    }
}
