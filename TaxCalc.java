import java.util.*;
public class TaxCalc
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);

      double origPrice, tax, fPrice;

      System.out.print("Original Price ($)? ");
      origPrice = keyboard.nextDouble();

      //change 0.1 to desired value
      tax = origPrice * 0.1;
      System.out.println("Tax = " + "$" + tax);

      fPrice = tax + origPrice;
      System.out.println("Final Price = " + "$" + fPrice);

   }
}
