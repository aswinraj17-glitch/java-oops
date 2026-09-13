class ParkingVehicle { String type; ParkingVehicle(String type) { this.type = type; } }
class ParkingSlot { String type; boolean occupied; ParkingSlot(String type) { this.type = type; } void park(ParkingVehicle v) { if (!occupied && type.equals(v.type)) { occupied = true; System.out.println(v.type + " parked"); } else System.out.println("Slot unavailable"); } }
public class ParkingManagement { public static void main(String[] args) { ParkingSlot slot = new ParkingSlot("Car"); slot.park(new ParkingVehicle("Car")); } }
