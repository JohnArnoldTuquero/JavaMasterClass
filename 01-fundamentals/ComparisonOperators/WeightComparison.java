import java.util.Scanner;

public class WeightComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Weight Comparison---");

        System.out.println("Enter your current weight: ");
        double initialWeight = sc.nextDouble();

        System.out.println("Enter your target weight: ");
        double targetWeight = sc.nextDouble();

        if ( initialWeight < targetWeight ) {
            System.out.println("You still have not achieve the target weight.");
        } else if ( initialWeight == targetWeight ) {
            System.out.println("Congratulations!!! you achieve your taret weight!!!");
        } else {
            System.out.println("you exceeded your target weight!");
        }

        sc.close();
    }
}
