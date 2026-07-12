import java.util.Scanner;

public class StudentIdInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.println("Student Information Card");

        System.out.print("Student Id: ");
        String id = input.nextLine();

        System.out.print("Name: ");
        String name = input.nextLine();

        System.out.print("Course: ");
        String course = input.nextLine();


        System.out.print("Year Level: \n");
        String yrLevel = input.nextLine();


        System.out.println("\n=============================");
        System.out.println("        Student Card         ");
        System.out.println("=============================");

        System.out.println("ID:      " + id);
        System.out.println("Name:    " + name);
        System.out.println("Course:  " + course);
        System.out.println("Year:    " + yrLevel);
        


        
    
    
    
    
        input.close();
    }
}
