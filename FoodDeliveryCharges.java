class FoodDeliveryPartner { void calculateCharge(int km) { System.out.println("Delivery charge"); } }
class BikePartner extends FoodDeliveryPartner { void calculateCharge(int km) { System.out.println("Bike charge: " + (km * 10)); } }
class CarPartner extends FoodDeliveryPartner { void calculateCharge(int km) { System.out.println("Car charge: " + (km * 20)); } }
public class FoodDeliveryCharges { public static void main(String[] args) { FoodDeliveryPartner p = new BikePartner(); p.calculateCharge(5); p = new CarPartner(); p.calculateCharge(5); } }
