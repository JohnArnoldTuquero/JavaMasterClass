import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        boolean isRunning = true; // lets make a variable na mag kontrol ng loop natin

        System.out.println("---- Calculator ----");

        while (isRunning) {

            // part 1 para makita yung mga choices
            System.out.println("\n[1] Addition");
            System.out.println("[2] Subtraction");
            System.out.println("[3] Multiplication");
            System.out.println("[4] Division");
            System.out.println("[5] Exit");
            System.out.print("Choose: ");
            int choice = input.nextInt();
            
            // exit to, para kung choice is 5 titigil agad 
            if (choice == 5 ) {
                System.out.println("Thank you! Goodbye.");
                isRunning = false;
                continue; // ito naman is para bumalik ulit dun sa taas ng loop
            }

            // ito is para pag lumagpas sa 5 or mababa sa 1 is mag i-invalid
            if (choice < 1 || choice > 5){
                System.out.println("Invalid BRUH");
                continue; // ito naman is para bumalik ulit dun sa taas ng loop
            }

            // part 2 para ma inout ng number
            System.out.print("Input First Num: ");
            double firstNum = input.nextDouble(); 

            System.out.print("Input Second Num: ");
            double secondNum = input.nextDouble();


            switch (choice) {
                case 1:
                    double sum = firstNum + secondNum;
                    System.out.printf("The Sum: %.2f\n", sum);
                    
                    break;

                case 2:
                    double difference = firstNum - secondNum;
                    System.out.printf("The Difference: %.2f\n", difference);
                    
                    break;

                case 3:
                    double product = firstNum * secondNum;
                    System.out.printf("The Product: %.2f\n", product);
                    
                    break;

                case 4:
                    if (secondNum == 0) {
                        System.out.println("Error cannot divide by zero!");
                    } else {
                        double quotient = firstNum / secondNum;
                        System.out.printf("The Quotient: %.2f\n", quotient);
                    }
                    break;

            }

        
    }

    input.close();
}

}