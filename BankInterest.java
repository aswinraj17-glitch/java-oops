class InterestAccount { void calculateInterest(int amount) { System.out.println("Interest"); } } 
class SavingsAccount extends InterestAccount { void calculateInterest(int amount) { System.out.println("Interest: " + (amount * 5 / 100)); } }
class CurrentAccount extends InterestAccount { void calculateInterest(int amount) { System.out.println("Interest: " + (amount * 2 / 100)); } }
public class BankInterest { public static void main(String[] args) { InterestAccount a = new SavingsAccount(); a.calculateInterest(10000); a = new CurrentAccount(); a.calculateInterest(10000); } }
