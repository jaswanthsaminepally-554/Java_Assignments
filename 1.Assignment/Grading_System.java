import java.util.Scanner;
public class Grading_System {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the marks obtained (0-100): ");
        int marks = scanner.nextInt();

        String grade;

        if (marks >= 90 && marks <= 100) {
            grade = "A";
        } else if (marks >= 80 && marks < 90) {
            grade = "B";
        } else if (marks >= 70 && marks < 80) {
            grade = "C"; 
        } else if (marks >= 60 && marks < 69) {
            grade = "D";
        }
         else if (marks >= 0 && marks < 33) {
            grade = "F";
        } else {
            grade = "Invalid marks entered.";
        }

        System.out.println("The grade is: " + grade);
        scanner.close();
    }
}