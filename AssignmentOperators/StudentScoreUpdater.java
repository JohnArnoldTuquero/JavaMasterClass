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
            System.out.print("Your new score is: " + initialScore);
        }







        



        input.close();
    }
}
