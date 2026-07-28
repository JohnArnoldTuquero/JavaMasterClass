import java.util.Scanner;

public class ExamScoreChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Exam Score Checker---");

        System.out.print("Enter your score: ");
        double score = sc.nextDouble();

        if ( score >= 75.0 ) {
            System.out.println("YOU PASS!!!");
        } else {
            System.out.println("DAMN BRO YOU FAILED!!");
        }

        

        sc.close();
    }
}
