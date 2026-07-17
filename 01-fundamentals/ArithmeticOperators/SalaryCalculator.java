import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("----Weekly Salary Calculator----");
        System.out.print("Input Hours Worked: ");
        double hoursWorked = input.nextDouble();

        System.out.print("Input Hourly Rate: ");
        double hourlyRate = input.nextDouble();

        input.nextLine();

        System.out.print("Do you have Overtime? (Yes/No): ");
        String overtime = input.nextLine();

        double grossSalary = 0;


        if ( overtime.equalsIgnoreCase("yes") ) {
           
            double regularPay = 40 * hourlyRate;
            double ovetimeHoursWorked = hoursWorked - 40;
            double ovetimeHourlyRate = ovetimeHoursWorked * hourlyRate * 1.5; 

            grossSalary = regularPay + ovetimeHourlyRate;

        } else if ( overtime.equalsIgnoreCase("no") ) {

            grossSalary = hoursWorked * hourlyRate;

        }

        System.out.println("\nYour Gross Salary for this week is: ₱" + grossSalary);


        input.close();
    }
}
