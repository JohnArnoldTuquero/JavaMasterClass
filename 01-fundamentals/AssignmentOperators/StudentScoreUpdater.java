import java.util.Scanner;

public class StudentScoreUpdater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String studentName = input.nextLine();

        System.out.print("Enter Initial Score: ");
        int initialScore = input.nextInt();


        System.out.print("Enter your new score: ");
        int newScore = input.nextInt();

        initialScore += newScore;

        System.out.print("Your new score is: " + initialScore);

        input.nextLine();

        System.out.print("\nAre you late? (yes/no): ");
        String choice = input.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            initialScore -= 5;
            System.out.print("Your new score is: " + initialScore);

        } else if (choice.equalsIgnoreCase("no")) {
            initialScore += 5;
            System.out.print("Your new score is: " + initialScore + ", We have +5 bonus for not late");
        } else {
            System.out.println("Invalid");
        }

        System.out.print("\nDid you pass the project? (yes/no): ");
        String choiceProject = input.nextLine();

        if (choiceProject.equalsIgnoreCase("yes")) {
            initialScore *= 2;
            System.out.print("Your new score is: " + initialScore);

        } else if (choiceProject.equalsIgnoreCase("no")) {
            System.out.print("Your new score is: " + initialScore + ", you din't get the 2x bonus");
        } else {
            System.out.println("Invalid");
        }


        System.out.print("\nHow many are you in the group? (maximum of 5): ");
        int choiceGroup = input.nextInt();

        initialScore /= choiceGroup;

        switch (choiceGroup) {
            case 1:
                System.out.println("The final score of solo member is " + initialScore);
                break;

            case 2:
                System.out.println("The final score of this duo is " + initialScore);
                break;

            case 3:
                System.out.println("The final score of this trio is " + initialScore);              
                break;

            case 4:
                System.out.println("The final score of this 4 member is " + initialScore);               
                break;

            case 5:
                System.out.println("The final score of 5 member is " + initialScore);              
                break;
        
            default:
                System.out.println("Invalid!! The maximum member per group is only 5");
                break;
        }

        int leftoverPoints = initialScore % choiceGroup;
        System.out.println("The leftover points reward for the group leader is: " + leftoverPoints);






        



        input.close();
    }
}
