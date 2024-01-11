import java.util.Scanner;

// abstract class
abstract class Account {
    String accountNumber;
    String accountHolderName;
    String IFSCCode;
    String contact;
    double balance;

    // constructor
    Account() {
        inputData();
        initializeBalance();
    }

    // method
    void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter account number:");
        accountNumber = scanner.nextLine();
        System.out.println("Enter account holder name:");
        accountHolderName = scanner.nextLine();
        System.out.println("Enter IFSC code:");
        IFSCCode = scanner.nextLine();
        System.out.println("Enter contact:");
        contact = scanner.nextLine();
    }

    void initializeBalance() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter balance (InRupees):");
        balance = scanner.nextDouble();
    }

    void displayDetails() {
        System.out.println("Account number: " + accountNumber);
        System.out.println("Account holder name: " + accountHolderName);
        System.out.println("IFSC code: " + IFSCCode);
        System.out.println("Contact: " + contact);
    }

    void balanceInfo() {
        System.out.println("Balance (InRupees): " + balance);
    }

    abstract void deposit();

    abstract void withdraw();
}

// inheritance
class SavingAccount extends Account {
    void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount to deposit (InRupees):");
        double amount = scanner.nextDouble();
        balance += amount;
    }

    // overriding

    void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount to withdraw (InRupees):");
        double amount = scanner.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
        }
    }
}
// inheritance
class CurrentAccount extends Account {
    void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount to deposit (InRupees):");
        double amount = scanner.nextDouble();
        balance += amount;
    }
    // overriding
    // method signature must be same
    // method body must be different
    // return type must be same
    void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount to withdraw (InRupees):");
        double amount = scanner.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
        }
    }
}

class AccountExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select account type (1 for Saving, 2 for Current):");
        int accountType = scanner.nextInt();
        scanner.nextLine(); // consume newline left-over
        Account account;
        if (accountType == 1) {
            account = new SavingAccount();
        } else if (accountType == 2) {
            account = new CurrentAccount();
        } else {
            System.out.println("Invalid account type.");
            return;
        }
        account.displayDetails();
        while (true) {
            System.out.println("Select operation (1 for Deposit, 2 for Withdraw, 3 for Balance Enquiry, 4 for Exit):");
            int operation = scanner.nextInt();
            if (operation == 1) {
                account.deposit();
            } else if (operation == 2) {
                account.withdraw();
            } else if (operation == 3) {
                account.balanceInfo();
            } else if (operation == 4) {
                break;
            } else {
                System.out.println("Invalid operation.");
            }
        }
    }
}