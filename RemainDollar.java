import java.util.*;
public class RemainDollar
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);

      double price, cash, change;

      System.out.print("Price ($)? ");
      price = keyboard.nextDouble();

      System.out.print("Cash ($)? ");
      cash = keyboard.nextDouble();

      change = cash - price;
      System.out.println("Change = " + change );


   }
}