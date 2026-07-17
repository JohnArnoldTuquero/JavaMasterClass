import java.util.Scanner;

public class MiniSavingsBank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean isRunning = true;
        double balance = 100.00;

        System.out.println("---- Bank ----");

        while (isRunning) {

            System.out.println("\n[1] Check Balance");
            System.out.println("[2] Deposit");
            System.out.println("[3] Withdraw");
            System.out.println("[4] Exit Bank");
            System.out.print("Choose: ");
            int choice = input.nextInt();

            if (choice == 4) {
                System.out.println("Thank You!");
                System.out.println("Come Again!");
                isRunning = false;
                continue;
            }

            if (choice < 1 || choice > 4)  {
                System.out.println("Invalid BRUH");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("----Balance----");
                    System.out.print("Current balance: " + balance );
                    
                    break;

                case 2:
                    System.out.println("----Deposit----");
                    System.out.print("How much will you deposit: ");
                    double amount = input.nextDouble();

                    balance += amount;

                    System.out.printf("Your new balance: %.2f", balance);
                    
                    break;

                case 3:
                    System.out.println("----Withdraw----");
                    
                    System.out.println("Enter Withdraw Amount: ");
                    double withdrawAmount = input.nextDouble();

                    if (withdrawAmount > balance) {
                        System.out.println("You can't Withdraw!!!");
                    } else {

                        System.out.printf("Congrats you just withdraw amount of $%.2f\n", withdrawAmount );

                        double newBalance = balance - withdrawAmount;

                        System.out.println("You're current balance is: " + newBalance);
                    }
                    break;

            }


            










        }

        input.close();
    }
    
}
