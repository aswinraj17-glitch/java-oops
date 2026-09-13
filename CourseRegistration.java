class Course {
    String name;
    int seats;
    Course(String name, int seats) { this.name = name; this.seats = seats; }
    void register() {
        if (seats > 0) { seats--; System.out.println("Registration successful"); }
        else System.out.println("No seats available");
    }
}

public class CourseRegistration {
    public static void main(String[] args) {
        Course c = new Course("Java", 2);
        c.register();
        c.register();
        c.register();
    }
}
