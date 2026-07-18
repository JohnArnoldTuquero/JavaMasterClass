import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double rate = 61.67;

        System.out.println("----Currency Converter----");
        System.out.println("------Peso to Dollar------");
        System.out.print("Enter amount of Philippine Peso: ");
        double peso =  input.nextDouble();

        double  dollar = peso / rate;

        System.out.printf("Conversion Amount is: %.2f$", dollar);
        
       input.close();
    }
}
