import java.util.*;
public class CalcAreaPerimeter
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);

      double length, width, area, perimeter;

      System.out.print("Length (m)? ");
      length = keyboard.nextDouble();

      System.out.print("Width (m)? ");
      width = keyboard.nextDouble();

      area = length * width;
      System.out.println("Area (m^2)" + area);

      perimeter = area * width;
      System.out.println("Perimeter (m)" +  perimeter);
   }
}