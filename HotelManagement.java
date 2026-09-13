class HotelRoomType { void calculatePrice(int days) { System.out.println("Room price"); } }
class SingleRoom extends HotelRoomType { void calculatePrice(int days) { System.out.println("Single room: " + days * 1000); } }
class DoubleRoom extends HotelRoomType { void calculatePrice(int days) { System.out.println("Double room: " + days * 1800); } }
class SuiteRoom extends HotelRoomType { void calculatePrice(int days) { System.out.println("Suite room: " + days * 3000); } }
public class HotelManagement { public static void main(String[] args) { HotelRoomType r = new SingleRoom(); r.calculatePrice(2); r = new SuiteRoom(); r.calculatePrice(2); } }
