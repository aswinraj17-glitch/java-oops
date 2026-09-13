class TheatreSeats {
    private int availableSeats = 100;
    void bookTicket(int seats) {
        if (seats <= availableSeats) { availableSeats -= seats; System.out.println("Booking successful"); }
        else System.out.println("Not enough seats");
    }
    void showSeats() { System.out.println("Available seats: " + availableSeats); }
}
public class MovieTicketBooking {
    public static void main(String[] args) { TheatreSeats t = new TheatreSeats(); t.bookTicket(5); t.bookTicket(10); t.showSeats(); }
}
