package String;

public class StringsBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abc");

        sb.setCharAt(2, 'd');
        System.out.println(sb);

        StringBuilder sbb = new StringBuilder("abcd");
        
       sbb.setCharAt(0, 'x');// char at specific index
          System.out.println(sbb);
       sbb.append('e'); // char at end of string
          System.out.println(sbb);
       sbb.insert(2, 's');//Inserts text at the specified index position
           System.out.println(sbb);
       sbb.reverse();
           System.out.println(sbb);
       sbb.delete(1, 2);
           System.out.println(sbb);
    }
}
