package cancer;
import java.util.Scanner;
public class ColonCancer 
{
 Scanner scan=new Scanner(System.in);
 Login log=new Login();
 public void Odds3 ()
 {
   System.out.println("|             7  >> Blood shortage                               |");
   System.out.println("|             8  >> Cramps and stomach ache                      |");
   System.out.println("|             9  >> Vomiting and nausea                          |");
   System.out.println("|________________________________________________________________|");
  }
    public void TypeOfCancer3()
   {
       System.out.println("________________________________________________________________");
       System.out.println("Unfortunately you have Colon Cancer");
       System.out.println("For treatment enter any key to continue");
       System.out.println("________________________________________________________________");
   }
 public void Treatment3()
   {
     int w; 
     System.out.println("________________________________________________________________");
     System.out.println("1  >> Surgery");
     System.out.println("2  >> Chemotherapy");
     System.out.println("________________________________________________________________");
     w=scan.nextInt();
     System.out.println("________________________________________________________________");
     if(w==1)
     {
         System.out.println("________________________________________________________________");
         System.out.println("The disease is: Colon Cancer");
         System.out.println("The best place to treat >> Gleneagles Global Hospitals in India");
         System.out.println("Duration of treatment: 3-9 Months");
         System.out.println("The success rate: 60%-90%");
         System.out.println("Cost = 6,000$ : 12,000$");
         log.Time();
         System.out.println("________________________________________________________________");
     }
     else if(w==2)
     {
         System.out.println("________________________________________________________________");
         System.out.println("The disease is: Colon Cancer");
         System.out.println("The best place to treat >> HCG Cancer Hospital in India ");
         System.out.println("Duration of treatment: 3-10 Months");
         System.out.println("The success rate: 70%-90%");
         System.out.println("Cost = 6,195$ : 12,345$");
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
