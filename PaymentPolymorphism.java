class Payment { void pay() { System.out.println("Making payment"); } }
class UPI extends Payment { void pay() { System.out.println("Payment through UPI"); } }
class CreditCard extends Payment { void pay() { System.out.println("Payment through Credit Card"); } }
public class PaymentPolymorphism {
    public static void main(String[] args) {
        Payment p = new UPI(); p.pay();
        p = new CreditCard(); p.pay();
    }
}
