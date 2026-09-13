class DeliveryCustomer { void deliveryCharge() { System.out.println("Delivery charge"); } }
class NormalCustomer extends DeliveryCustomer { void deliveryCharge() { System.out.println("Delivery charge: 50"); } }
class PremiumCustomer extends DeliveryCustomer { void deliveryCharge() { System.out.println("Free delivery"); } }
public class DeliveryCharges { public static void main(String[] args) { DeliveryCustomer c = new NormalCustomer(); c.deliveryCharge(); c = new PremiumCustomer(); c.deliveryCharge(); } }
