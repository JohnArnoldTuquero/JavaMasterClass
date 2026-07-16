import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        boolean isRunning = true; // lets make a variable na mag kontrol ng loop natin

        System.out.println("---- Calculator ----");

        while (isRunning) {

            System.out.println("\n[1] Addition");
            System.out.println("[2] Subtraction");
            System.out.println("[3] Multiplication");
            System.out.println("[4] Division");
            int choice = input.nextInt();
            double firstNum = 0;
            double secondNum = 0;

            switch (choice) {
                case 1:
                    System.out.print("Input First Num: ");
                    firstNum = input.nextDouble(); 

                    System.out.print("Input Second Num: ");
                    secondNum = input.nextDouble();

                    double sum = firstNum + secondNum;

                    System.out.printf("The sum: %.2f\n", sum);
                    
                    break;

                case 2:
                    System.out.print("Input First Num: ");
                    firstNum = input.nextDouble(); 

                    System.out.print("Input Second Num: ");
                    secondNum = input.nextDouble();

                    double difference = firstNum - secondNum;

                    System.out.printf("The sum: %.2f", difference);
                    
                    break;

                case 3:
                    
                    break;
                
                case 4:
                    
                    break;
            
                default:
                    break;
            }
            
        }








        input.close();
    }
}
