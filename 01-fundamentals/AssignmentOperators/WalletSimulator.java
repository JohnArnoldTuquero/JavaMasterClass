import java.util.Scanner;

public class WalletSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Wallet Simulator---");

        System.out.print("Enter current money: ");
        double currentMoney = sc.nextDouble();

        sc.nextLine();
        System.out.print("Did you get allowance? ");
        String allowanceChoice = sc.nextLine();

        if ( allowanceChoice.equalsIgnoreCase("yes")) {
            System.out.print("How much allowance did you get? ");
            double  allowance = sc.nextDouble();

            currentMoney += allowance;
            sc.nextLine();

            System.out.println("Your updated allowance is " + currentMoney);
        } else if ( allowanceChoice.equalsIgnoreCase("no")) {
            System.out.println("Ok please continue...");
        } else {
            System.out.println("Invalid answer!!!");
        }

        
        System.out.println("Did you buy food today? ");
        String foodChoice = sc.nextLine();

        if ( foodChoice.equalsIgnoreCase("yes")) {
            System.out.print("How much did you spend on food today? ");
            double  food = sc.nextDouble();

            currentMoney -= food;
            sc.nextLine();

            System.out.println("Your updated allowance is " + currentMoney);
        } else if ( foodChoice.equalsIgnoreCase("no")) {
            System.out.println("Ok please continue...");
        } else {
            System.out.println("Invalid answer!!!");
        }


        
        System.out.println("Did you buy new school supplies? ");
        String suppliesChoice = sc.nextLine();

        if ( suppliesChoice.equalsIgnoreCase("yes")) {
            System.out.print("How much did you spend school supplies? ");
            double  supplies = sc.nextDouble();

            currentMoney -= supplies;
            sc.nextLine();

            System.out.println("Your updated allowance is " + currentMoney);
        } else if ( suppliesChoice.equalsIgnoreCase("no")) {
            System.out.println("Ok please continue...");
        } else {
            System.out.println("Invalid answer!!!");
        }

        
        System.out.println("Did you save some money from your allowance? ");
        String saveMoney = sc.nextLine();

        if ( saveMoney.equalsIgnoreCase("yes")) {
            System.out.print("How much did you save? ");
            double  savings = sc.nextDouble();

            currentMoney -= savings;
            sc.nextLine();

            System.out.println("Your updated allowance is " + currentMoney);
        } else if ( saveMoney.equalsIgnoreCase("no")) {
            System.out.println("Ok please continue...");
        } else {
            System.out.println("Invalid answer!!!");
        }

        System.out.println("Final Wallet Balance: " + currentMoney);

        sc.close();
    }
}
