class DeliveryService { void deliver() { System.out.println("Delivering product"); } }
class BikeDeliveryService extends DeliveryService { void deliver() { System.out.println("Delivering by bike"); } }
class TruckDeliveryService extends DeliveryService { void deliver() { System.out.println("Delivering by truck"); } }
public class DeliveryManagement {
    public static void main(String[] args) {
        DeliveryService d = new BikeDeliveryService(); d.deliver();
        d = new TruckDeliveryService(); d.deliver();
    }
}
