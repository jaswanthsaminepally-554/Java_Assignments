// Filename: Student_Marks.java
import java.util.Scanner;

class Student {
    int rollNumber;
    String name;
    int marks[] = new int[5];   // array of 5 subjects

    // Constructor
    Student(int rollNumber, String name, int[] marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    // Calculate total marks
    int calculateTotal() {
        int total = 0;
        for (int m : marks) {
            total += m;
        }
        return total;
    }

    // Calculate average marks
    double calculateAverage() {
        return calculateTotal() / 5.0;   // 5 subjects
    }

    // Get grade based on average
    String getGrade() {
        double avg = calculateAverage();
        if (avg >= 90) {
            return "A";
        } else if (avg >= 75) {
            return "B";
        } else if (avg >= 50) {
            return "C";
        } else {
            return "Fail";
        }
    }
}

public class Student_Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student students[] = new Student[3];  // array of 3 students

        // Input details for 3 students
        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));
            System.out.print("Roll Number: ");
            int roll = sc.nextInt();
            sc.nextLine();  // consume newline
            System.out.print("Name: ");
            String name = sc.nextLine();

            int marks[] = new int[5];
            System.out.println("Enter marks for 5 subjects:");
            for (int j = 0; j < 5; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[j] = sc.nextInt();
            }

            // Create Student object
            students[i] = new Student(roll, name, marks);
        }

        // Display details
        System.out.println("\n--- Student Report ---");
        for (Student s : students) {
            System.out.println("\nName: " + s.name);
            System.out.println("Roll Number: " + s.rollNumber);
            System.out.println("Total Marks: " + s.calculateTotal());
            System.out.printf("Average Marks: %.2f\n", s.calculateAverage());
            System.out.println("Grade: " + s.getGrade());
        }

        sc.close();
    }
}
