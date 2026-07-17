import java.util.Scanner;

public class AdditionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Addition Calculator");
        System.out.print("Input first number: ");
        int firstNum = input.nextInt();
 
        System.out.print("Input Second number: ");
        int secondNum = input.nextInt();

        int sum = firstNum + secondNum;

        System.out.print("Sum = " + sum);



        input.close();
    }
}
