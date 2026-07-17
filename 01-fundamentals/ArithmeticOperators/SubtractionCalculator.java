import java.util.Scanner;

public class SubtractionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Subtraction Calculator");
        System.out.print("Input first number: ");
        int firstNum = input.nextInt();
 
        System.out.print("Input Second number: ");
        int secondNum = input.nextInt();

        int diff = firstNum - secondNum;

        System.out.print("Sum = " + diff);



        input.close();
    }
}
