package OOPs;
class Employee{
 String name;
 private int job_id;
 String desgination;

 public Employee(String name, int job_id, String desgination){
    this.name = name;
    this.job_id = job_id;
    this.desgination = desgination;
 }

 public Employee(){
     name = "Katie";
     job_id = 55;
     desgination = "Team Leader";
 }


 
 //getter 
 public int getJobId(){
     return job_id;
 }
 
 //setter
 public void setJobId(int job_id){

    if(job_id <= 5){
        return;
    }
    this.job_id = job_id;
 }

//print function 
 public void print(){
     System.out.println(name + " " + job_id + " " + desgination);
 }

}

public class Job {
    public static void main(String[] args) {
       Employee emp;
       emp = new Employee("Sara", 50, "Junior Developer");
       //emp.name = "Shadow";
       //emp.setJobId(20);
       //emp.desgination = "Junior Eng.";
       emp.print();
       //System.out.println(emp.name + " " + emp.getJobId() + " " + emp.desgination); 

       Employee emp1;
       emp1 = new Employee("Kylie", 101, "Senior Developer");
       //emp1.name = "Katie";
       //emp1.setJobId(7);
       //emp1.desgination = "Junior Data Scientist";
       emp1.print();
       //System.out.println(emp1.name + " " + emp1.getJobId() + " " + emp1.desgination);
       
       

    }
}
