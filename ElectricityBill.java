class BillCustomer { void calculateBill(int units) { System.out.println("Bill"); } }
class DomesticCustomer extends BillCustomer { void calculateBill(int units) { System.out.println("Domestic bill: " + (units * 5)); } }
class CommercialCustomer extends BillCustomer { void calculateBill(int units) { System.out.println("Commercial bill: " + (units * 8)); } }
public class ElectricityBill {
    public static void main(String[] args) {
        BillCustomer c = new DomesticCustomer(); c.calculateBill(100);
        c = new CommercialCustomer(); c.calculateBill(100);
    }
}
