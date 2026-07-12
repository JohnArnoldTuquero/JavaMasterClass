import java.util.Scanner;

public class RectangleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Rectangle Calculator\n");

        System.out.print("Input Length:");
        double length = input.nextDouble();

        System.out.print("Input Width:");
        double width = input.nextDouble();

        double area = length * width;

        System.out.printf("\nThe area is %.2f", area);


        input.close();

    }

}