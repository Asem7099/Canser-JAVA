package cancer;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Date;

public class Login {

    Scanner scan = new Scanner(System.in);
    double weight, length;
    int age;
    String FirstName, LastName, sex, FileName;
    String address, blood, number;
    String arr[] = {"A+", "A-", "B+", "B-", "AB+", "AB-", "0+", "0-"};

    public void Enter() {
        String q;
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("@@ _______________________________________________________________________________________ @@");
        System.out.println("@@|                                           		                                  |@@");
        System.out.println("@@|                                           		                                  |@@");
        System.out.println("@@|                                           		                                  |@@");
        System.out.println("@@|                                           		                                  |@@");
        System.out.println("@@|                                           		                                  |@@");
        System.out.println("@@|                                           		                                  |@@");
        System.out.println("@@|                                  WELCOME TO                                           |@@");
        System.out.println("@@|                                                                                       |@@");
        System.out.println("@@|                         CHECK FOR THE TYPE OF CANCER                                  |@@");
        System.out.println("@@|                                                                                       |@@");
        System.out.println("@@|                                                                                       |@@");
        System.out.println("@@|                                                                                       |@@");
        System.out.println("@@|                                                                                       |@@");
        System.out.println("@@|                                                                                       |@@");
        System.out.println("@@|                                                                                       |@@");
        System.out.println("@@|   Enter any key to continue...                                                        |@@");
        System.out.println("@@|_______________________________________________________________________________________|@@");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        q = scan.nextLine();
    }

    public void information() {
        System.out.println("File Name: ");
        FileName = scan.nextLine();
        System.out.println("First Name: ");
        FirstName = scan.next();
        System.out.println("Last Name: ");
        LastName = scan.next();
        System.out.println("Age: ");
        age = scan.nextInt();
        System.out.println("Sex(M/F): ");
        sex = scan.next();
        System.out.println("Weight(in Kg): ");
        weight = scan.nextDouble();
        System.out.println("Length(in Cm): ");
        length = scan.nextDouble();
        System.out.println("Blood type: " + Arrays.toString(arr));
        blood = scan.next();
        System.out.println("Contact number: ");
        number = scan.next();
        System.out.println("Address: ");
        address = scan.next();
    }

    public void file() {
        System.out.println("________________________________________________________________");
        try {
            try (PrintWriter f = new PrintWriter(FileName)) {
                f.println("First Name: " + FirstName);
                f.println("Last Name: " + LastName);
                f.println("Age: " + age);
                f.println("Sex: " + sex);
                f.println("weight: " + weight + "Kg");
                f.println("length: " + length + "Cm");
                f.println("Blood: " + blood);
                f.println("Contact number: " + number);
                f.println("Address: " + address);
            }
            try (FileReader o = new FileReader(FileName)) {
                BufferedReader s = new BufferedReader(o);
                String i;
                while ((i = s.readLine()) != null) {
                    System.out.println(i);
                }
            }
        } catch (Exception ex) {
            System.out.println("Error/file not found");
        }
        System.out.println("________________________________________________________________");
    }

    public void Time() {
        Date time = new Date();
        System.out.println(time);
    }
}
