import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Temperature Converter---");

        double celcius;
        double fahrenheit;

        System.out.println("Celsius → Fahrenheit");
        System.out.println("Fahrenheit → Celsius");
        System.out.print("What do you want to convert? ");
        String choice = sc.nextLine();
        

        switch (choice.toLowerCase()) { // read text
            case "celcius":
                System.out.print("Enter Celcius: ");
                celcius = sc.nextDouble();

                fahrenheit = (celcius * 9.0/5) + 32;

                System.out.printf("Celcius to Fahrenheit is %.2f", fahrenheit);
                
                break;

            case "fahrenheit":
                System.out.print("Enter Fahrenheit: ");
                fahrenheit = sc.nextDouble();

                celcius = (fahrenheit - 32) * 5.0/9;

                System.out.printf("Fahrenheit to Celcius is %.2f", celcius);
                
                break;
        
            default:
                System.out.println("Invalid cuh");
                break;
        }




        sc.close();
    }
}
