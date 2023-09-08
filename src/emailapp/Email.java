package emailapp;

import java.util.Locale;
import java.util.Scanner;

public class Email {
   private String firstName;
   private String lastName;
   private String password;
   private String department;
   private String email;
   private int defaultPasswordLength = 8;
   private int mailboxCapacity = 500;
   private String alternateEmail;
   private String companySuffix = "abcCompany.com";

   //constructor to receive the first name and last name
    public Email(String firstName, String lastName){
       this.firstName = firstName;
       this.lastName = lastName;
       //System.out.println("Email Created " + this.firstName + " " + this.lastName);

        // call the method asking for the department- return the department
        this.department = setDepartment();
      // System.out.println("Department: "+ this.department);

        // call a method that a return a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your Password is: " + this.password);

        // combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        //System.out.println("Your Email is: " + email);
    }

    //ask for the department
    private String setDepartment(){
        System.out.print("NEW Worker: " + firstName + " DEPARTMENT CODES\n1 for Sales \n2 for Development \n3 for " +
                "Accounting \n0 for " +
                "none\nEnter " +
                "the " +
                "department code: ");
        Scanner in = new Scanner(System.in);
      int departChoice = in.nextInt();

        switch (departChoice){
            case 1:
                return "sales";
            case 2:
                return "Development";
            case 3:
                return "Accounting";
            default:
                return "";
        }
    }

    // generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ01234567889$%#";
        char[] password = new char[length];
        for (int i = 0; i < length; i++){
           int rand = (int) (Math.random() * passwordSet.length());
           password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // set the mail capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;

}

    // set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    // change the password
    public void changePassword(String password){
        this.password = password;
    }
    public int getMailboxCapacity() {return mailboxCapacity;}
    public String getAlternateEmail() {return alternateEmail;}
    public String getPassword() {return password;}

    public String showInfo(){
        return "DISPLAY NAME: " + firstName + " " + lastName + "\nCOMPANY EMAIL: " + email + "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
     }
}
