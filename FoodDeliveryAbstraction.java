abstract class DeliveryBase { abstract void deliver(); }
class BikeDeliveryBase extends DeliveryBase { void deliver() { System.out.println("Food delivered by bike"); } }
class CarDeliveryBase extends DeliveryBase { void deliver() { System.out.println("Food delivered by car"); } }
public class FoodDeliveryAbstraction {
    public static void main(String[] args) {
        DeliveryBase d = new BikeDeliveryBase(); d.deliver();
    }
}
