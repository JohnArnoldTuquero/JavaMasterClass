import java.util.Scanner;

public class ModulusCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Modulus Calculator");
        System.out.print("Input first number: ");
        int firstNum = input.nextInt();
 
        System.out.print("Input Second number: ");
        int secondNum = input.nextInt();

        int remainder = firstNum % secondNum;

        System.out.print("Sum = " + remainder);



        input.close();
    }
}
