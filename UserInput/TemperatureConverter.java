import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Temperature Converter\n");

        System.out.print("What do you want to convert (Celcius/Fareheit)? ");
        String choice = input.nextLine();


        if (choice.equalsIgnoreCase("celcius")) {
            System.out.print("Input Celcius: ");
            double  celcius = input.nextDouble();

            double fahrenheit = (celcius * 9 / 5) + 32;

            System.out.printf("Converion: %.2f", fahrenheit);
        
        } else if (choice.equalsIgnoreCase("celcius")) {
            System.out.print("Input Fahrenheit: ");
            double  fahrenheit = input.nextDouble();

            double celcius = (fahrenheit - 32) * 5 / 9;

            System.out.printf("Converion: %.2f", celcius);

        } else {
            System.out.println("This is not in the choices!");
        }
        



        input.close();  
    }
}
