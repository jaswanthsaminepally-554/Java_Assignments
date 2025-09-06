import java.util.Scanner;

public class ATM_Simulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 10000;

        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    double w = sc.nextDouble();
                    if (w <= balance) {
                        balance -= w;
                        System.out.println("Withdrawn " + w + ". Balance = " + balance);
                    } else {
                        System.out.println("Insufficient funds!");
                    }
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double d = sc.nextDouble();
                    balance += d;
                    System.out.println("Deposited " + d + ". Balance = " + balance);
                    break;
                case 3:
                    System.out.println("Current balance = " + balance);
                    break;
                case 4:
                    System.out.println("Thank you for using ATM!");
                    sc.close();
                    return; 
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}