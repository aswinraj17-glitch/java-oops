class HotelRoom {
    int roomNumber; boolean available = true;
    HotelRoom(int roomNumber) { this.roomNumber = roomNumber; }
    void bookRoom() {
        if (available) { available = false; System.out.println("Room " + roomNumber + " booked"); }
        else System.out.println("Room already booked");
    }
    void cancelBooking() { available = true; System.out.println("Booking cancelled"); }
}
public class HotelRoomBooking {
    public static void main(String[] args) {
        HotelRoom r = new HotelRoom(101); r.bookRoom(); r.bookRoom(); r.cancelBooking(); r.bookRoom();
    }
}
