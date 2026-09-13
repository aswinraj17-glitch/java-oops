class RentalVehicle { void calculateRent(int days) { System.out.println("Rent"); } }
class RentalCar extends RentalVehicle { void calculateRent(int days) { System.out.println("Car rent: " + (days * 1000)); } }
class RentalBike extends RentalVehicle { void calculateRent(int days) { System.out.println("Bike rent: " + (days * 500)); } }
public class VehicleRental {
    public static void main(String[] args) {
        RentalVehicle v = new RentalCar(); v.calculateRent(3);
        v = new RentalBike(); v.calculateRent(3);
    }
}
