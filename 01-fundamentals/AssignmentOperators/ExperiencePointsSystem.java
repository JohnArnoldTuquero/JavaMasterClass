import java.util.Scanner;

public class ExperiencePointsSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean confirmChoice = false;

        System.out.println("--Experience Points (XP) System--");

        System.out.print("Enter player's name: ");
        String playerName = input.nextLine();

        System.out.print("Enter Starting XP: ");
        double currentXp = input.nextDouble();

        System.out.println("You are " + playerName + ", You currently have " + currentXp + " xp.");

        System.out.println("--Mission Reward--");
        System.out.print("Enter XP earned from the Boss Mission: ");
        double xpEarned = input.nextDouble();

        currentXp += xpEarned;

        System.out.printf("Your updated XP: %.2f", currentXp);


        System.out.println("\n--Secret Chest Event--");

        input.nextLine();
        System.out.print("Did you participate to the secret chest event? (yes/no)");
        String choice = input.nextLine();
        

        if ( choice.equalsIgnoreCase("yes")) {
            System.err.print("\nEnter Bonus Chest XP reward you got: ");
            double bonusXp = input.nextDouble();

            currentXp += bonusXp;

            System.out.printf("Your updated XP: %.2f", currentXp);
        } else if (choice.equalsIgnoreCase("no")) {
            System.out.printf("That;s unfortunate, your current Xp is %.2f", currentXp);
        } else {
            System.out.println("Invalid Answer!!!");
        }

        
        System.out.println("\n---Penalty Check---");

        System.out.println("How many times did you die in the battle event? ");
        double deathCount = input.nextDouble();

        currentXp -= (deathCount * 10);

        if (currentXp < 0) {
            currentXp = 0;
            System.out.println("Ouch! Your XP dropped below zero, resetting to 0.");
        }

        System.out.printf("Your updated XP: %.2f", currentXp);

        System.out.println("\n----Final XP----");
        System.out.printf("You " + playerName + " have Xp of %.2f", currentXp );
            
        




        input.close();
    }
}
