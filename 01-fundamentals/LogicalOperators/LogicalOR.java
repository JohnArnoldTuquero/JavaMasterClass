import java.util.Scanner;

public class LogicalOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Logical OR---");

        System.out.println("---Discount Eligibility Checker---");

        System.out.print("Do you carry a student ID card? (true/false): ");
        boolean studentChoice = sc.nextBoolean();

        System.out.print("Are you above 60 years old? (true/false): ");
        boolean ageChoice = sc.nextBoolean();

        if ( studentChoice || ageChoice) {
            System.out.println("You get a 10% discount, Have a great day!!!");
        } else {
            System.out.println("You didn't get the 10% discount, Have a great day!!!");
        }


        sc.close();
    }
}
