abstract class StartVehicle { abstract void start(); }
class StartCar extends StartVehicle { void start() { System.out.println("Car engine started"); } }
class StartBike extends StartVehicle { void start() { System.out.println("Bike engine started"); } }
public class VehicleStarting {
    public static void main(String[] args) { StartVehicle v = new StartCar(); v.start(); }
}
