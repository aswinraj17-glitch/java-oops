class CabVehicle { void calculateFare(int km) { System.out.println("Calculating fare"); } }
class CabBike extends CabVehicle { void calculateFare(int km) { System.out.println("Bike fare: " + (km * 10)); } }
class CabAuto extends CabVehicle { void calculateFare(int km) { System.out.println("Auto fare: " + (km * 15)); } }
class CabCar extends CabVehicle { void calculateFare(int km) { System.out.println("Car fare: " + (km * 25)); } }
public class CabBooking {
    public static void main(String[] args) {
        CabVehicle v = new CabBike(); v.calculateFare(10);
        v = new CabAuto(); v.calculateFare(10);
        v = new CabCar(); v.calculateFare(10);
    }
}
