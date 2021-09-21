import java.util.*;
public class ClubMember
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);

      String mebershipType;
      double mebershipCost;

      System.out.print("Please Enter Membership Type (Full, Junior or Life)?");
      membershipType = keyboard.nextString();

      membershipCost = 0;

      if(membershipType =("Full"))
      {
         membershipCost = 160;
      }
         if(membershipType = ("Junior"))
         {
            membershipCost = 80;
         }
         else
         {
            membershipCost = 10;
         }
        System.out.print("Membership Cost = " + membershipCost);
   }
}