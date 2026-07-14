import java.util.Scanner;

public class MultiplicationCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Multiplication Calculator");
        System.out.print("Input first number: ");
        int firstNum = input.nextInt();
 
        System.out.print("Input Second number: ");
        int secondNum = input.nextInt();

        int product = firstNum * secondNum;

        System.out.print("Sum = " + product);



        input.close();
    }
}
