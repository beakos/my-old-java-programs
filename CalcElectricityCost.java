import java.util.*;
public class CalcElectricityCost
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);

      System.out.println("Please enter electricity used:");

      int electricityUsed = keyboard.nextInt();
      double amountOwed = 50 + electricityUsed * 0.20;

      if(electricityUsed >= 1000)
      {
         double surcharge=80;
         System.out.println("The surcharge is: " + surcharge);
         amountOwed = amountOwed + surcharge;
      }

      System.out.println("The amount owed is: " + amountOwed);

    }
}