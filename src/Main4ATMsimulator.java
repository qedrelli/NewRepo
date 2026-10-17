import java.util.Objects;
import java.util.Scanner;

public class Main4ATMsimulator {
    public static void main(String[] args) {

        Scanner atm = new Scanner(System.in);

        boolean loggedIn = false;
        double balance = 1000;
        String password = "9978";

        for (int i = 2; i >= 0; i--) {
            System.out.print("=====SIMPLE ATM=====\nEnter your PIN: ");
            String pin = atm.nextLine();

            if (Objects.equals(pin, password)) {
                System.out.println("Login successful!");
                loggedIn = true;
                break;
            }
            System.out.println("Incorrect PIN.\nAttempts left: " + i);
        }
        if (!loggedIn) {
            System.out.println("Your card has been blocked.");
            return;
        }

        boolean running = true;
        while (running) {
            System.out.println("=====ATM MENU=====\n1. Check balance\n2. Deposit money\n3. Withdraw money\n\n4. Exit");
            System.out.print("Choose an option: ");
            int opt = atm.nextInt();

            if (opt == 1) {
                System.out.println("Your current balance is: $" + balance);
            } else if (opt == 2) {
                System.out.print("Enter deposit amount: ");
                int deposit = atm.nextInt();
                if (deposit > 0) {
                    balance += deposit;
                    System.out.println("Deposit successful.\nYour new balance is: $" + balance);
                } else if (deposit < 0) {
                    System.out.println("Wrong value.");
                }
            } else if (opt == 3) {
                System.out.print("Enter withdrawal amount: ");
                int withdraw = atm.nextInt();
                if (withdraw > balance) {
                    System.out.println("Withdrawal amount is greater than your balance.");
                } else if (withdraw > 0) {
                    balance -= withdraw;
                    System.out.println("Withdrawal succesful.\nYour new balance is: $" + balance);
                } else if (withdraw < 0) {
                    System.out.println("Wrong value.");
                }
            } else if (opt == 4) {
                break;
            }
        }

    }
}