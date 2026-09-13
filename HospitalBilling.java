class HospitalBill { int total; void addCharge(int amount) { total += amount; } void show() { System.out.println("Hospital bill: " + total); } }
public class HospitalBilling { public static void main(String[] args) { HospitalBill b = new HospitalBill(); b.addCharge(500); b.addCharge(1000); b.show(); } }
