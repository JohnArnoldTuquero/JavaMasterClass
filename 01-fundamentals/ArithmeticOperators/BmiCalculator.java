import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("---Body Mass Index (BMI) Calculator---");

        System.out.println("Enter Weight in KG");
        double weight = input.nextDouble();

        System.out.println("Enter Height in CM");
        double height = input.nextDouble();

        double m = height / 100;
        double bmi = weight / Math.pow(m, 2);

        System.out.printf("Your BMI is %.2f", bmi);


        input.close();
    }
}
