import java.util.*;

class Bank {
    private double balance;

    public Bank(double initial) {
        balance = initial;
    }

    public double getBal() {
        return balance;
    }

    public void depo(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

class ATMmachine {
    private Bank userAccount;

    public ATMmachine(Bank account) {
        userAccount = account;
    }

    public void displayOptions() {
        System.out.println("ATM Options:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void checkBalance() {
        double balance = userAccount.getBal();
        System.out.println("Your account balance is: $" + balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            userAccount.depo(amount);
            System.out.println("$" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (userAccount.withdraw(amount)) {
                System.out.println("$" + amount + " withdrawn successfully.");
            } else {
                System.out.println("Insufficient funds for withdrawal.");
            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Bank userAccount = new Bank(1000.0);
        ATMmachine atm = new ATMmachine(userAccount);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            atm.displayOptions();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter the deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter the withdrawal amount: $");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
