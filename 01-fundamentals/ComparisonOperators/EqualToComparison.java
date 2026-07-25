import java.util.Scanner;

public class EqualToComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println(num1 == num2); // meaning neto is ipag co-compare niya yung dalawa and if equal sila then "true" if not then "false"..... pls see the notes

        sc.close();
    }
}
