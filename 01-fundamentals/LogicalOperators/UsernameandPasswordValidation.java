import java.util.Scanner;

public class UsernameandPasswordValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String accountUsername = "admin";
        String accountPassword = "admin";

        System.out.println("---Tp Link Login---");

        System.out.println("Enter username: ");
        accountUsername = sc.nextLine();

        System.out.println("Enter password: ");
        accountUsername = sc.nextLine();

        if ( accountUsername.equals(accountUsername) && accountPassword.equals(accountPassword))  {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Invalid Username or Password!!");
        }

        


        sc.close();
    }
}
