package String;

import java.util.Scanner;

public class ImplementStrstr {

    public static int strstr(String s, String x)
   {
      // return s.indexOf(x);
      int xlen = x.length();
      for(int i = 0; i < s.length(); ++i) {
          if(s.charAt(i) == x.charAt(0)) {
              int j;
              for(j = 1; j < xlen; ++j) {
                  if(i+j < s.length()) {
                       if(s.charAt(i+j) != x.charAt(j)) {
                           break;
                       }
                  } else {
                      break;
                  }
              }
              if(j == xlen) {
                  return i;
              }
          }
      }
      return -1;
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String st = sc.nextLine();
        int stt = strstr(str, st);
        System.out.println(stt);
        sc.close();
    }
}
