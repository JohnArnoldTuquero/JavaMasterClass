import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Voting Eligibility---");

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter your citizenship status: ");
        String citizen = sc.next();

        if ( age >= 18 && citizen.equalsIgnoreCase("filipino"))  {
            System.out.println("You are allowed to vote!");
        } else {
            System.out.println("You are not allowed to vote!!");
        }

        


        sc.close();
    }
}
