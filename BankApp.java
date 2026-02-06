import java.util.Scanner;

class Account {
    String name;

    public Account(String name) {
        this.name = name;
    }

    public String getAccountType() {
        return "Generic Account";
    }
}

class BankAccount extends Account {
    private double balance; 

    public BankAccount(String name, double initialBalance) {
        super(name);
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Success! You deposited: " + amount);
        } else {
            System.out.println("Error: Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Error: Insufficient funds. Balance: " + balance);
        } else if (amount <= 0) {
            System.out.println("Error: Amount must be positive.");
        } else {
            balance -= amount;
            System.out.println("Success! You withdrew: " + amount);
        }
    }

    public double checkBalance() {
        return balance;
    }

    @Override
    public String getAccountType() {
        return "General Bank Account";
    }
}

public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount myAccount = null;
        boolean running = true;

        System.out.println("SIMPLE MINI BANK");

        while (running) {
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Show Account Type");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();

                if (choice == 1) {
                    System.out.print("Enter your name: ");
                    scanner.nextLine(); // Fix scanner bug
                    String name = scanner.nextLine();
                    myAccount = new BankAccount(name, 0.0);
                    System.out.println("Account created for " + name);
                
                } else if (choice == 2) {
                    if (myAccount != null) {
                        System.out.print("Amount to deposit: ");
                        myAccount.deposit(scanner.nextDouble());
                    } else {
                        System.out.println("Create an account first!");
                    }

                } else if (choice == 3) {
                    if (myAccount != null) {
                        System.out.print("Amount to withdraw: ");
                        myAccount.withdraw(scanner.nextDouble());
                    } else {
                        System.out.println("Create an account first!");
                    }

                } else if (choice == 4) {
                    if (myAccount != null) {
                        System.out.println("Balance: " + myAccount.checkBalance());
                    } else {
                        System.out.println("Create an account first!");
                    }

                } else if (choice == 5) {
                    if (myAccount != null) {
                        System.out.println("Type: " + myAccount.getAccountType());
                    } else {
                        System.out.println("Create an account first!");
                    }

                } else if (choice == 6) {
                    running = false;
                    System.out.println("Goodbye!");

                } else {
                    System.out.println("Invalid number. Please choose 1-6.");
                }

            } else {
                System.out.println("Please enter a valid number.");
                scanner.next();
            }
        }
        scanner.close();
    }
}

//testing smth