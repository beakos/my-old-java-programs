import java.util.*;
public class Num
{
   public static void main(String[] args)
   {
      int iNum1 = 1, iNum2 = 2;
      double dNum1 = 1.0, dNum2 = 2.0;
      iNum2 = iNum1 * 7;
      int iDiv = iNum1 / iNum2;
      dNum2 = 5 + dNum1;
      double dMix = iNum2 * dNum1;

       System.out.print(iNum2);
       System.out.println(iDiv);
       System.out.print(dMix);
       System.out.println(dNum2);
       System.out.println(dNum1 - iNum1);

   }
}