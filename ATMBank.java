import java.util.Scanner;

public class ATMBank {
    private static double balance = 0.0; 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nATM Menu:");
            System.out.println("1. Enter your card with your pin code");
            System.out.println("2. Check Balance");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Display Current Balance");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Card inserted. PIN verified.");
                    break;
                case 2:
            
                    checkBalance();
                    break;
                case 3:
                    System.out.print("Enter the amount to deposit: $");
                    double depositAmount = sc.nextDouble();
                    deposit(depositAmount);
                    break;
                case 4:
                    System.out.print("Enter the amount to withdraw: $");
                    double withdrawAmount = sc.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 5:
    
                    displayBalance();
                    break;
                case 6:
                    System.out.println("Exiting ATM. Have a nice day!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        } while (choice != 6);
    }

    private static void checkBalance() {
        System.out.println("Your current balance is: $" + balance);
    }

    private static void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of $" + amount + " successful.");
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive amount.");
        }
    }

    private static void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    private static void displayBalance() {
        System.out.println("Your current balance is: $" + balance);
    }
}