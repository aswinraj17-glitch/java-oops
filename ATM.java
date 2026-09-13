class ATMAccount {
    private int balance;
    ATMAccount(int balance) { this.balance = balance; }
    void withdraw(int amount) {
        if (amount <= 0) System.out.println("Invalid amount");
        else if (amount > balance) System.out.println("Insufficient balance");
        else { balance -= amount; System.out.println("Withdrawal successful"); }
    }
    void showBalance() { System.out.println("Balance: " + balance); }
}
public class ATM {
    public static void main(String[] args) { ATMAccount account = new ATMAccount(10000); account.withdraw(3000); account.showBalance(); }
}
