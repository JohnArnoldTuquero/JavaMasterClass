import java.util.Scanner;

public class BankBalanceSimulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean confirmChoice = false;
        double balance = 0.0;
        double bankRate = 1.05;

        System.out.println("--Welcome to Bank Balance Simulator--");

        while (!confirmChoice) {

            System.out.print("Enter Initial Balance: ");
            balance = input.nextDouble();

            input.nextLine();

            System.out.print("So this is your balance: " + balance + " Correct? (yes/no) ");
            String choice = input.nextLine();

            if ( choice.equalsIgnoreCase("yes")) {
                confirmChoice = true;
            } else if ( choice.equalsIgnoreCase("no")) {
                System.out.println("Let's try again.\n");
            } else {
                System.out.println("Invalid Response!");
            }

        }

        System.err.println("\n---Deposit Section---");

        System.out.println("Enter amount to deposit: ");
        double depositAmount = input.nextDouble();

        balance += depositAmount;

        System.out.printf("Your new balance is $%.2f\n",  balance);


        System.err.println("\n--- Withdrawal Section ---");

        System.out.println("Enter amount to withdraw: ");
        double withdrawAmount = input.nextDouble();

        if (withdrawAmount > balance) {
            System.out.println("Transaction Denied: Insufficient Funds!");
        } else {
            balance -= withdrawAmount;
            System.out.println("Transaction Successful!");
        }


        System.err.println("\n---Annual Interest Boost---");

        System.out.println("Our bank have 5% rate booster");
        input.nextLine();
        System.out.println("Will you invest in our bank (yes/no):");
        String choice = input.nextLine();

        if ( choice.equalsIgnoreCase("yes")){
            balance *= bankRate;
            System.out.printf("Your new growing balance is: $%.2f\n", balance);

        } else if (choice.equalsIgnoreCase("no")) {
            System.out.println("That's very unfortunate...");

            System.out.println("\nAre you sure you don't want to invest? ");
            choice = input.nextLine();

            if (choice.equalsIgnoreCase("yes")) {
                System.out.println("Understood. No changes were made to your account.");
                System.out.printf("Your balance is still: $%.2f\n", balance);
            } else if (choice.equalsIgnoreCase("no")) {
                System.out.println("Great choice! Implementing the 5% rate booster now...");

                balance *= bankRate;

                System.out.printf("Your new growing balance is: $%.2f\n", balance);

            } else {

                System.out.println("Invalid response! Assuming you don't want to invest.");

            }

        } else {
            System.out.println("Invalid Response!");
        }

        System.err.println("\n--- Joint Account Final Share ---");
        System.out.print("How many family members will share the remaining balance?: ");
        double memberCount = input.nextDouble();

        balance /= memberCount;
        System.out.printf("The final share for each family member is: $%.2f\n", balance);



        System.out.println("Goodbye Stay Safe!!!");


        input.close();
    }
}
