class Ride { void book() { System.out.println("Ride booked"); } }
class RideBike extends Ride { void book() { System.out.println("Bike booked"); } }
class RideAuto extends Ride { void book() { System.out.println("Auto booked"); } }
class RideCar extends Ride { void book() { System.out.println("Car booked"); } }
public class RideBooking { public static void main(String[] args) { Ride r = new RideBike(); r.book(); r = new RideAuto(); r.book(); r = new RideCar(); r.book(); } }
