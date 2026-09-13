class BankAccountType { void withdrawalLimit() { System.out.println("Standard limit"); } }
class SavingsBankAccount extends BankAccountType { void withdrawalLimit() { System.out.println("Savings withdrawal limit"); } }
class SalaryBankAccount extends BankAccountType { void withdrawalLimit() { System.out.println("Salary account withdrawal limit"); } }
public class OnlineBanking { public static void main(String[] args) { BankAccountType a = new SavingsBankAccount(); a.withdrawalLimit(); a = new SalaryBankAccount(); a.withdrawalLimit(); } }
