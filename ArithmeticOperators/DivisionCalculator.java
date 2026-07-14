import java.util.Scanner;

public class DivisionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Multiplication Calculator");
        System.out.print("Input first number: ");
        double firstNum = input.nextInt();
 
        System.out.print("Input Second number: ");
        double secondNum = input.nextInt();

        double product = firstNum / secondNum;

        System.out.printf("Sum = %.1f", product);



        input.close();
    }
}
