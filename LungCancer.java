package cancer;
import java.util.Scanner;
public class LungCancer
{
 Scanner scan=new Scanner(System.in); 
 Login log=new Login();
 public void Odds2()
 {
     System.out.println("|             4  >> The change in sound becomes rougher          |");
     System.out.println("|             5  >> Pneumonia                                    |");
     System.out.println("|             6  >> Coughing up blood                            |");
 }
 public void TypeOfCancer2()
 {
       System.out.println("________________________________________________________________");
       System.out.println("Unfortunately you have Lung Cancer");
       System.out.println("For treatment enter any key to continue");
       System.out.println("________________________________________________________________"); 
 }
 public void Treatment2()
 {
      int w;
     System.out.println("________________________________________________________________"); 
     System.out.println("1  >> Surgery to remove the lung");
     System.out.println("2  >> Radiation therapy");
     System.out.println("________________________________________________________________");
     w=scan.nextInt();
     System.out.println("________________________________________________________________");
     if(w==1)
     {
         System.out.println("________________________________________________________________");
         System.out.println("The disease is: Lung Cancer");
         System.out.println("The best place to treat >> The American Hospital in Thailand");
         System.out.println("Duration of treatment: 8-10 Monthes");
         System.out.println("The success rate: 70%-80%");
         System.out.println("Cost = 10,500$ : 20,000$");
         log.Time();
         System.out.println("________________________________________________________________");
         
     }
     else if(w==2)
     {
         System.out.println("________________________________________________________________");
         System.out.println("The disease is: Lung Cancer");
         System.out.println("The best place to treat >> Helios Hospital west of Munich in Germany");
         System.out.println("Duration of treatment: 8-10 Months");
         System.out.println("The success rate: 70%-80%");
         System.out.println("Cost = 6,257$ : 12,677$");
         log.Time();
         System.out.println("________________________________________________________________");
     }
     else
     {   System.out.println("________________________________________________________________");
         System.out.println("Invalid choice");
         System.out.println("Please try again");
         log.Time();
         System.out.println("________________________________________________________________");
     }  
 }
}
