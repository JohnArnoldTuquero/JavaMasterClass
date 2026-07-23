import java.util.Scanner;

public class MonthlySavingsTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int monthCounter = 1;
        String continueChoice = "yes";

        System.out.println("---Monthly Savings Tracker---");

        System.out.print("Enter Initial Savings: ");
        double InitialSavings = sc.nextDouble();

        while (continueChoice.equalsIgnoreCase("yes")) {
            
            System.out.print("How many months have you been saving this? ");
            int monthSavingCount = sc.nextInt();

            sc.nextLine();
            System.out.println("So you've been saving " + InitialSavings + " for about " + monthSavingCount + " months.");
            System.out.print("Confirmation -(Yes/no): ");
            String confirmationChoice = sc.nextLine();

            if (confirmationChoice.equalsIgnoreCase("yes")) {
                System.err.println("Thank You, Please Procced to next step...");
            } else if (confirmationChoice.equalsIgnoreCase("no")) {
                System.out.print("So how many months have you been saving this? ");
                monthSavingCount = sc.nextInt();

                sc.nextLine();
                System.out.println("So you've been saving " + InitialSavings + " for about " + monthSavingCount + " months.");
                System.err.println("Thank You, Please Procced to next step...");

            } else {
                System.out.println("Invalid!!!");
            }

            System.out.print("\nEnter deposit for Month " + monthCounter + ": ");
            double deposit = sc.nextDouble();

            InitialSavings += deposit;

            System.out.println("Your updated Savings: " + InitialSavings);

            System.out.print("\nEnter expense for this month: ");
            double expenses = sc.nextDouble();

            InitialSavings -= expenses;

            System.out.println("Your updated Savings: " + InitialSavings);

            sc.nextLine();
            System.out.print("\nDo you want to track another month? (yes/no): ");
            continueChoice = sc.nextLine();

            monthCounter++; //mag +1 yung pagtanong na month kung mag papatuloy pa yung user




        }

        sc.close();
    }
}




/*
## 13. Monthly Savings Tracker

Input:

- Current Savings

Update savings for several months using assignment operators.

Display the savings after every month.

---


*/