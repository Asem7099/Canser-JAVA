package cancer;
import java.util.Scanner;
public class Leukemia 
{
    Scanner scan=new Scanner(System.in);
    Login log=new Login();
    public void Odds ()
 { 
   System.out.println(" ________________________________________________________________");
   System.out.println("|                                           	                 |");
   System.out.println("|             1  >> Loss of appetite and weight loss             |");
   System.out.println("|             2  >> Extreme sweating                             |");
   System.out.println("|             3  >> Difficulty and shortness of breath           |");
 }
   public void TypeOfCancer()
   {
       System.out.println("Unfortunately you have Blood Cancer(Leukemia)");
       System.out.println("For treatment enter any key to continue");
   }
   public void Treatment()
   {
     int w;
     System.out.println("________________________________________________________________");
     System.out.println("1  >> Stem cell therapy");
     System.out.println("2  >> Nanotechnology treatment");
     System.out.println("________________________________________________________________");
     w=scan.nextInt();
     System.out.println("________________________________________________________________");
     if(w==1)
     {
         System.out.println("________________________________________________________________");
         System.out.println("The disease is: Blood Cancer(Leukemia)");
         System.out.println("The best place to treat >> University Hospital of Mannheim in Germany");
         System.out.println("Duration of treatment: 2.5-3 Years");
         System.out.println("The success rate: 20%-40%");
         System.out.println("Cost = 29,936$ : 73,296$");
         log.Time();
         System.out.println("________________________________________________________________");
     }
     else if(w==2)
     {   
         System.out.println("________________________________________________________________");
         System.out.println("The disease is: Blood Cancer(Leukemia)");
         System.out.println("The best place to treat >> University Hospital of Ulm in Germany");
         System.out.println("Duration of treatment: 2.5-3 Years");
         System.out.println("The success rate: 40%-80%");
         System.out.println("Cost = 72,231$ : 271,677$");
         log.Time();
         System.out.println("________________________________________________________________");
     }
     else
     {
         System.out.println("________________________________________________________________");
         System.out.println("Invalid choice");
         System.out.println("Please try again");
         log.Time();
         System.out.println("________________________________________________________________");
     }
   }
}
