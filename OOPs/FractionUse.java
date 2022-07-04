package OOPs;
class Fraction{
     int numerator;
    int denominator;

    public Fraction(int numerator, int denominator){
        if(denominator == 0){
            //throws error
            denominator = 1;
        }
      this.numerator = numerator;
      this.denominator = denominator;
      simplify();
    }
     
    //getter for numerator
    public int getNumerator(){
       return numerator;
    }
 
    //setter for numerator
    public void setNumerator(int num){
        this.numerator = num;
    }

    public int getDenominator(){
        return denominator;
    }

    public void setDenominator(int num){
        if(num == 0){
            return;
        }
        this.denominator = num;
        simplify();
    }

    public void simplify(){
        int gcd = 1;
        int smaller = Math.min(numerator, denominator);
        for(int i = 2; i <= smaller; i++){
            if(numerator % i == 0 && denominator % i == 0){
                gcd = i;
            }
        }
        numerator = numerator / gcd;
        denominator = denominator / gcd;
    }

    public void print(){
        System.out.println(numerator + "/" + denominator);
    }

    public void increment(){
        numerator = numerator + denominator;
        simplify();
    }

 /// pass only Fraction f2 argument in add function

    public void add(Fraction f2){
       //First fraction is the function on which function is called
       ///Second fraction is passed as arguments

       this.numerator = this.numerator * f2.denominator + f2.numerator * this.denominator;
       this.denominator = this.denominator * f2.denominator;
       simplify();
    }

    ///pass two arguments in add function with static function

    public static Fraction add(Fraction f1, Fraction f2){

        int newNemo = f1.numerator * f2.denominator + f2.numerator * f1.denominator;
        int newDeno = f1.denominator * f2.denominator;
        Fraction f3 = new Fraction(newNemo, newDeno);
        return f3;
    }

}
public class FractionUse {
    public static void main(String[] args) {
       Fraction f1 = new Fraction(4, 6);
       f1.print();
       
       //fr.increment();
       Fraction f2 = new Fraction(1, 2);
       //f1.add(f2);
       //f1.print();

       Fraction f3 = Fraction.add(f1, f2);
       f3.print();
    }
}
