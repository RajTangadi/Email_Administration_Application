package emailapp;

import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = in.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = in.nextLine();
        Email em1 = new Email(firstName,lastName);
        System.out.println( em1.showInfo());

        // em1.setAlternateEmail("raj@gmail.com");
       // System.out.println(em1.getAlternateEmail());
    }
}
