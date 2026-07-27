import java.util.Scanner;

public class SalaryComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double minimumWage = 755.0;

        System.out.println("---Salary Comparison---");

        System.out.print("Enter the amount of your salary per day: ");
        double salary = sc.nextDouble();

        if ( salary >= minimumWage ) {
            System.out.println("Your salary meets or exceeds the minimum wage!");
        } else if ( salary == minimumWage ) {
            System.out.println("Your salary is exactly the minimum wage!");
        } else {
            System.out.println("Your salary is below minimum wage!");
        }


        sc.close();
    }
}
