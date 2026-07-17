import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Circle Calculator: \n");

        System.out.print("Input Radius:");
        double radius = input.nextDouble();

        // Math.PI meaning is pie

        double diameter = 2 * radius;
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.printf("This is the radius: %.2f", radius);
        System.out.printf("\nThis is the diameter: %.2f", diameter);
        System.out.printf("\nThis is the circumference: %.2f", circumference);
        System.out.printf("\nThis is the area: %.2f", area);


        input.close();
    }
}
