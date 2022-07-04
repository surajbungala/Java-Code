package OOP;

class Office{
    public void details(){
        System.out.println("Office Details");
    }
}

class Emp extends Office{
    public void details(){
        System.out.println("Emp details");
    }
}
public class Polymorpism{
public static void main(String[] args) {
    
    Office of = new Emp();
    of.details();
}
}