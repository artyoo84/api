package cmm02.op;

import java.util.Calendar;

public class No03_3HangDemo {

   public static void main(String[] args) {
      int left=1;
      int right=0;
      int result;
      boolean boo=true;
      result=boo?left:right;
      System.out.println("���׿����� ����� : "+result);
      Calendar c = Calendar.getInstance();
      int year = c.get(Calendar.YEAR);
      System.out.println(year);
      
      
      
      
   }
}