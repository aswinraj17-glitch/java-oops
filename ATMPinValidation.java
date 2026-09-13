class PINValidator {
    private int pin = 1234; private int attempts;
    void login(int enteredPin) {
        attempts++;
        if (enteredPin == pin) System.out.println("Login successful");
        else if (attempts < 3) System.out.println("Wrong PIN");
        else System.out.println("Card blocked");
    }
}
public class ATMPinValidation {
    public static void main(String[] args) { PINValidator atm = new PINValidator(); atm.login(1111); atm.login(2222); atm.login(3333); }
}
