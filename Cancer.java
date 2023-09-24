package cancer;
import java.util.Scanner;
public class Cancer {
   public static void main(String[] args)
    {
      String r; 
      int e; 
 Login log=new Login();
 Leukemia l=new Leukemia();
 LungCancer l2=new LungCancer();
 ColonCancer l3=new ColonCancer();
 Scanner scan=new Scanner(System.in);  
      log.Enter();
      log.information(); 
      log.file();
      l.Odds();
      l2.Odds2();
      l3.Odds3();
          e=scan.nextInt();
          if(e==1||e==2||e==3)
          {
            l.TypeOfCancer();
            r=scan.next();          
                  l.Treatment();
           }
           else if(e==4||e==5||e==6)
           {
              l2.TypeOfCancer2();
              r=scan.next();
              l2.Treatment2();    
           }
           else if(e==7||e==8||e==9)
           {
               l3.TypeOfCancer3();
               r=scan.next();
               l3.Treatment3();
           }
            else
            {
               System.out.println("Invalid choice");
               System.out.println("Please try again");
               log.Time();
          } 
      }    
}
