public class BankAccount extends Account {
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
            System.out.println("Error: Insufficient funds. Your balance is only " + balance);
        } else if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be positive.");
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