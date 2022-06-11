package OOPs;
class Student{

 public String name;
 final private int rollNum; //can't change value that's why use final
 double cgpa;
 public final static double CONVERSIONFACTOR = 0.95; //static for class not object
 private static int numStudents;

 public Student(String name){
     this.name = name;
     numStudents++;
     //rollnum and numstudents are count from 1
     this.rollNum = numStudents;
     
 }
//contsructor without parameterized
 public Student(){
     name = "Alex";
     numStudents++;
     this.rollNum = numStudents;
 }

 //numstudent is a static variable thats why define static get method
 public static int getNumStudent(){
     //non-static can't define in static function
     return numStudents;
 }
  
 //getter for private rollnum
 public int getRollNum(){
    return this.rollNum;
 }

//print function
 public void print(){
     System.out.println(name + " " + rollNum);
 }

 public void setRollNum(int rollNum){
     if(rollNum <= 0){
         return;
     }
     //this.rollNum = rollNum;
 }
}
public class Static {
    public static void main(String[] args) {

        //static variable are belongs to class not objects 
        System.out.println(Student.getNumStudent());

        /*
        non-static variable doesn't access by class , its access only static variable
        System.out.println(Student.name);
         */

        //System.out.println(Students.numStudents);
        //Student s1 = new Student("Raj");
        
        //Student s2 = new Student("Alex");
    
        //System.out.println(s1.getNumStudent());

    /*static variable belongs to class not for objects that's why showing warning
        //System.out.println(s2.numStudents);
        //System.out.println(s3.numStudents);
        */

        //System.out.println(s2.getNumStudent());
        //Student s3 = new Student("Suzi");
        
        
    }
}
