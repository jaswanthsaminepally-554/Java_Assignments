import java.util.Scanner;
public class Sum_Of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println("Sum of digits is: " + sum);
        sc.close();
    }
}
//Enter a number: 2024
//Sum of digits is: 8
