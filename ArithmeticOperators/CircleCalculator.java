import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Circle Calculator");

        System.out.print("Input Radius: ");
        double radius = input.nextDouble();

        double diameter = radius * 2;
        double circumference = Math.PI * diameter;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("Results:");

        System.out.printf("The Area is %.1f\n", area);
        System.out.printf("The Circumference is %.1f\n", circumference);
        System.out.printf("The Diameter is %.1f", diameter);


        input.close();
    }
}
