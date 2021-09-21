import java.util.*;
public class AverageTemp
{
   public static void main(String[] args)
   {
      double avgTemp;
      int minTemp, maxTemp;

      Scanner keyboard = new Scanner(System.in);

      System.out.print("Maximum Tempreature? ");
      maxTemp = keyboard.nextInt();

      System.out.print("Minimum Tempreature? ");
      minTemp = keyboard.nextInt();

      avgTemp = 0.5 * (maxTemp + minTemp);

      System.out.println("Average tempreature = " + avgTemp);
   }
}

