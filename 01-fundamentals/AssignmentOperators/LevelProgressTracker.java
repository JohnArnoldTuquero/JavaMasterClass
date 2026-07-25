import java.util.Scanner;

public class LevelProgressTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Level Progress Tracker---");

        System.out.print("Enter your starting level: ");
        int initialLevel = sc.nextInt();

        sc.nextLine();
        System.out.print("So your starting level is " + initialLevel + ", correct? (yes/no): ");
        String levelChoice = sc.nextLine();

        if (levelChoice.equalsIgnoreCase("yes")) {
            System.out.println("Ok please continue...");
        } else if ( levelChoice.equalsIgnoreCase("no")) {
            
            while (levelChoice.equalsIgnoreCase("no")) {
        System.out.print("Please enter your right starting level: ");
        initialLevel = sc.nextInt();
        
        sc.nextLine();
        System.out.print("Is this now the correct starting level? (yes/no): ");
        levelChoice = sc.nextLine();
        }

        } else {
            System.out.println("Invalid Answer!!!");
        }
        

        System.out.println("Your starting level is " + initialLevel);

        System.out.print("After hours of playing, how much level up did you get? ");
        int levelUp = sc.nextInt();

        initialLevel +=levelUp;

        System.out.println("Your updated level is " + initialLevel);

        sc.nextLine();
        System.out.print("Did you do the bonus challenge? ");
        String bonusChallengeChoice = sc.nextLine();

        if ( bonusChallengeChoice.equalsIgnoreCase("yes")) {
            initialLevel *= 2;
        } else if ( bonusChallengeChoice.equalsIgnoreCase("no")) {
            System.out.println("Too bad we were having 2x multiplier, please continue...");
        } else {
            System.out.println("Invalid Answer!!!");
        }

        System.out.println("Your updated level is " + initialLevel);




        sc.close();
    }
}
