package Recursion;

public class ReplacePi {

    public static String replacePi(String s){
        //base case

        if(s.length() <= 1){
            return s;
        }

        if(s.charAt(0) == 'p' && s.charAt(1) == 'i'){
            //call recursion on string of length n - 2
            String smallOutput = replacePi(s.substring(2));
            return "3.14" + smallOutput;
        }else{
            //call recursion on string for length n - 1
            String smallOutput = replacePi(s.substring(1));
            return s.charAt(0) + smallOutput;
        }
    }
    public static void main(String[] args) {
        String str = replacePi("piapipiapia");
        System.out.println(str);
    }
}
