import java.util.Scanner;
public class AddTwoNumbers
{
   public static void main(String[] args)//executable (main) function start
   {
      //create scanner object connected to the keyboard
      Scanner keyboard = new Scanner(System.in);
      //display forst number prompt on screen
      System.out.print("First number?");
      //fetch first number from keyboard and assign value to variable no.1
      int number1 = keyboard.nextInt();
      //display prompt for the second number on the screen
      System.out.print("Second number?");
      //fetch second number from the keyboard and assign value to variable no.2
      int number2 = keyboard.nextInt();
      //calculate the sum
      int total = number1 + number2;
      //display on screen
      System.out.println("The total is: " + total);
   }
}
