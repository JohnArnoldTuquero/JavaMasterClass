import java.util.Scanner;

public class HealthPointsSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Health Points System---");

        System.out.print("Enter your starting HP: ");
        double startingHp = sc.nextDouble();

        System.out.print("\nSo your starting health is "+ startingHp + " (yes/no): ");
        String choiceStartingHp = sc.nextLine();

        if ( choiceStartingHp.equalsIgnoreCase("yes")) {
            System.out.println("Ok please continue...");
        } else if ( choiceStartingHp.equalsIgnoreCase("no")) {
            System.out.print("Please enter your right starting HP: ");
            startingHp = sc.nextDouble();
            sc.nextLine(); // para linisin yung yung enter key dito kasi nga kumuha tayo ng new double...
        } else {
            System.out.println("Invalid Answer!!!");
        }

        System.out.println("Your starting HP: " + startingHp);

        sc.nextLine();
        System.out.print("\nWhile on battle did you take some damage? ");
        String choiceDamage = sc.nextLine();

        if ( choiceDamage.equalsIgnoreCase("yes")) {
            System.out.print("Enter take damaged: ");
            double damageTake = sc.nextDouble();

            startingHp -= damageTake;
        } else if ( choiceDamage.equalsIgnoreCase("no")) {
            System.out.println("Ok please continue...");
        } else {
            System.out.println("Invalid Answer!!!");
        }

        System.out.println("Your updated HP: " + startingHp);

        sc.nextLine();
        System.out.print("\nWhile on battle did you take healing Potion? ");
        String healingChoice = sc.nextLine();

        if ( healingChoice.equalsIgnoreCase("yes")) {
            System.out.print("Enter how much hp you get: ");
            double healTake = sc.nextDouble();

            startingHp += healTake;
        } else if ( healingChoice.equalsIgnoreCase("no")) {
            System.out.println("Ok please continue...");
        } else {
            System.out.println("Invalid Answer!!!");
        }

        System.out.println("Your updated HP: " + startingHp);


        sc.nextLine();
        System.out.print("\nWhile on battle did you take power up Potion? ");
        String powerUpChoice = sc.nextLine();

        if ( powerUpChoice.equalsIgnoreCase("yes")) {
            System.out.print("Enter how much did you get using power up: ");
            double powerUp = sc.nextDouble();

            startingHp *= powerUp;
        } else if ( powerUpChoice.equalsIgnoreCase("no")) {
            System.out.println("Ok please continue...");
        } else {
            System.out.println("Invalid Answer!!!");
        }

        System.out.println("Your updated HP: " + startingHp);






        

        sc.close();
    }
}
