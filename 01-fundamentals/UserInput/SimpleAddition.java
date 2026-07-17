import java.util.Scanner;

public class SimpleAddition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Simple Addition\n");

        System.out.print("Input first Digit: ");
        int num1 = input.nextInt();

        System.out.print("Input Second Digit");
        int num2 = input.nextInt();

        int answer = num1 + num2;

        System.out.printf("Answer: " + answer);

        input.close();
    }
    
}
