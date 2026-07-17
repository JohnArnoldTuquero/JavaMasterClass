import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("----Average Calculator----");
        System.out.print("Input first number: ");
        double firstNum = input.nextDouble();
 
        System.out.print("Input Second number: ");
        double secondNum = input.nextDouble();

        System.out.print("Input Third number: ");
        double thirdNum = input.nextDouble();

        double average = (firstNum + secondNum + thirdNum) / 3;
       

        System.out.printf("Average = %.1f\n", average);
        

        input.close();
    }
}
