import java.util.*;
public class TestExamMark
{
    public static void main(String[] args)
    {
       Scanner keyboard = new Scanner(System.in);   
       
       int examMark = 0, labMark = 0;   
       double result = 0;   
       String grade = "", failMsg = "";
       
      //input the Exam Mark
       System.out.print("Exam mark (0 - 100) ? ");   
       examMark = keyboard.nextInt();   
       
       //input the Overall Assesment Marks (Average Mark)
       System.out.print("Lab mark (0 - 100) ? ");   
       labMark = keyboard.nextInt(); 
       
       if(examMark >= 0 && examMark <= 100 && labMark >= 0 && labMark <= 100)
       {
           if(examMark < 50) 
           {
               failMsg = "Exam fail"; 
           }
           if(labMark < 50) 
           {
               if(failMsg.equals(""))
               {
                   failMsg = "Lab fail"; 
               }
               else
               {
                   failMsg += ", lab fail"; 
               }
           }
           result = 0.5 * (examMark + labMark);    
           if(result >= 50 && failMsg.equals(""))
           {
               grade = "pass";     
               System.out.println("Result " + result + ", " + grade); 
           }
            else 
            {     
            grade = "fail";     
            System.out.println("Result " + result + ", " + grade);     
            System.out.println(failMsg); 
            }
       }
       else
       {
           System.out.print("Error, mark is between 0 and 100"); 
       }
    }
}