import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("----Simple Calculator----");
        System.out.print("Input first number: ");
        double firstNum = input.nextDouble();
 
        System.out.print("Input Second number: ");
        double secondNum = input.nextDouble();

        double sum = firstNum + secondNum;
        double diff = firstNum - secondNum;
        double product = firstNum * secondNum;
        double quotient = firstNum / secondNum;
        double remainder = firstNum % secondNum;

        System.out.printf("Sum = %.2f\n", sum);
        System.out.printf("Difference = %.2f\n", diff);
        System.out.printf("Product = %.2f\n", product);
        System.out.printf("Quotient = %.2f\n", quotient);
        System.out.printf("Remainder = %.2f\n", remainder);



        input.close();
    }
}
