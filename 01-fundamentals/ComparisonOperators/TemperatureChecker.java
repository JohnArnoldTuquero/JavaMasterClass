import java.util.Scanner;

public class TemperatureChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double freezingPoint = 0.0;
        double roomTemp = 25.0;
        double hotWeather = 35.0;

        System.out.println("---Temperature Checker---");

        System.out.print("Enter current temperature: ");
        double currentTemp = sc.nextDouble();

        if ( currentTemp <= freezingPoint ) { // equal to 0 or less than 0 
            System.out.println("Your temperature is freezing point");
        } else if ( currentTemp == roomTemp ) { // equal to 25 means room temp
            System.out.println("Your temperature is room temperature");
        } else if ( currentTemp >= hotWeather ) { // equal to 35 or greater than 35 
            System.out.println("Your temperature is hot");
        } else {
            System.out.println("INVALID ANSWER!!!");
        }


        sc.close();
    }
}
