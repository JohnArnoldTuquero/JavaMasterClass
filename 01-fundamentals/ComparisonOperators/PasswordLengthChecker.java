import java.util.Scanner;

public class PasswordLengthChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int requiredPassLength = 8;

        System.out.println("---Password Length Checker---");

        System.out.println("Lets check if the length of your password is strong:");
        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        if ( password.length() >= requiredPassLength ) {  // ginagamit yung lenght() para i convert yung string to number para mabilang 
            System.out.println("Valid password!!!");
        } else {
            System.out.println("Your password is too short!!");
        }

        sc.close();
    }


}