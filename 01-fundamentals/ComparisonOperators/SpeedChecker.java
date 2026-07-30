import java.util.Scanner;

public class SpeedChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int speedLimitExpressWays = 100;

        System.out.println("---Speed Checker in ---");

        System.out.println("Enter your speed: ");
        int initialSpeed = sc.nextInt();

        if (initialSpeed > speedLimitExpressWays ) {
            System.out.println("You exceeded the speed limit!!!");
        } else if (initialSpeed <= speedLimitExpressWays ) {
            System.out.println("Your speed is just right!!!");
        } else {
            System.err.println("IDK");
        }

        sc.close();
    }
}
