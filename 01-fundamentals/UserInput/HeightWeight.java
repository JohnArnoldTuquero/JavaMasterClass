import java.util.Scanner;

public class HeightWeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Height and Weight\n");

        System.out.print("Weight in lbs: ");
        double weight = input.nextDouble();

        System.out.print("Height in inches: ");
        Double height = input.nextDouble();

        double bmi = (weight / (height * height)) * 703;

        System.out.printf("Your Bmi is %.2f", bmi);

        // print





        input.close(); 
    }
}
