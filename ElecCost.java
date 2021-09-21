import java.util.*;
public class ElecCost
{
   public static void main(String[] args)
   {

      Scanner keyboard = new Scanner(System.in);

      int electricityUsed;
      double amountOwed, surcharge;

      System.out.println("Enter electricity used: ");
      electricityUsed = keyboard.nextInt();

      amountOwed = 50 + electricityUsed * 0.20;

      if(electricityUsed >= 1000)
      {
         surcharge = 80;
         System.out.println("The surcharge is: " + surcharge);
      }
   }
}