import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input your Height in cm: ");
        double heightCM = input.nextDouble();

        System.out.print("Input your Weight in kg: ");
        double weight = input.nextDouble();


        double heightM = heightCM / 100;

        double bmi = weight / (heightM * heightM);

        System.out.printf("Your BMI is: %.2f\n", bmi);

        if ( bmi < 18.5) {
            System.out.println("You are Underweight");
        } else if ( bmi >= 18.5 && bmi < 24.9 ) {
            System.out.println("You are Healthy!!!");
        } else if ( bmi >= 25.0 && bmi < 29.9) {
            System.out.println("You are Overweight");
        } else {
            System.out.println("You are TOO FUCKING BIG!!!!!");
        }

        // && meaning AND
        // || meaning OR

        input.close();
    }
}
