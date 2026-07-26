import java.util.Scanner;

public class GreaterThanComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("---Greater Than Comparison---");

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println( num1 > num2);




        sc.close();
    }
}
