import java.util.Scanner;

public class RectangleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Rectangle Calculator");

        System.out.print("Input Length: ");
        double length = input.nextDouble();

        System.out.print("Input Width: ");
        double width = input.nextDouble();

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("Results:");

        System.out.printf("The Area is %.1f\n", area);
        System.out.printf("The Perimeter is %.1f", perimeter);



        input.close();
    }
}
