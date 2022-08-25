import java.util.Scanner;

import static java.lang.System.*;


public class ProcessName {
    
    
public static void main(String[] args) {
        Scanner console = new Scanner(in);
        System.out.print("Enter your name: ");
        
        // your code goes here
        String fullName = console.nextLine();
        int begin = fullName.indexOf(" ");
        String lastName = fullName.substring(begin);
        String initial = String.valueOf(fullName.charAt(0));
        System.out.println("Your name is: " + lastName + ", " + initial );
    }
}