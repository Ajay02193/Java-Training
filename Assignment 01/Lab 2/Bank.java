public class Bank {
    private double amount;

    // Parameterized constructor to initialize amount
    public Bank(double amount) {
        this.amount = amount;
    }

    // Method to withdraw from the account
    public void withdraw(double withdrawalAmount) {
        String message = (withdrawalAmount <= amount) ? "Withdrawal successful" : "Insufficient balance";
        System.out.println(message);
        amount = (withdrawalAmount <= amount) ? amount - withdrawalAmount : amount;
    }

    // Method to deposit into the account
    public void deposit(double depositAmount) {
        amount += depositAmount;
    }

    // Method to display total balance
    public void displayBalance() {
        System.out.println("After Deposit Available balance: " + amount);
    }

    public static void main(String[] args) {
        // Creating an instance of Bank with an initial amount of 10000
        Bank account = new Bank(10000);

        // Withdraw some amount
        account.withdraw(5000);

        // Deposit 5000
        account.deposit(5000);

        // Display total balance
        account.displayBalance();
    }
}
