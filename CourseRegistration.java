class CourseRegistration {
    String name; int seats;
    CourseRegistration(String name, int seats) { this.name = name; this.seats = seats; }
    void register() { if (seats > 0) { seats--; System.out.println("Registration successful"); } else System.out.println("No seats available"); }
}
public class CourseRegistration { public static void main(String[] args) { CourseRegistration c = new CourseRegistration("Java",2); c.register(); c.register(); c.register(); } }
