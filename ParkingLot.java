class ParkingLotManager {
    int availableSpaces;
    ParkingLotManager(int spaces) { availableSpaces = spaces; }
    void parkVehicle() { if (availableSpaces > 0) { availableSpaces--; System.out.println("Vehicle parked"); } else System.out.println("Parking full"); }
    void removeVehicle() { availableSpaces++; System.out.println("Vehicle removed"); }
    void showSpaces() { System.out.println("Available spaces: " + availableSpaces); }
}
public class ParkingLot {
    public static void main(String[] args) {
        ParkingLotManager lot = new ParkingLotManager(2);
        lot.parkVehicle(); lot.parkVehicle(); lot.parkVehicle(); lot.showSpaces(); lot.removeVehicle(); lot.showSpaces();
    }
}
