package cmm02.op;

import java.util.Calendar;

public class No03_3HangDemo {

   public static void main(String[] args) {
      int left=1;
      int right=0;
      int result;
      boolean boo=true;
      result=boo?left:right;
      System.out.println("삼항연산자 결과값 : "+result);
      Calendar c = Calendar.getInstance();
      int year = c.get(Calendar.YEAR);
      System.out.println(year);
      
      
      
      
   }
}