class CourseBase { void startCourse() { System.out.println("Starting course"); } }
class VideoCourse extends CourseBase { void startCourse() { System.out.println("Watching recorded videos"); } }
class LiveCourse extends CourseBase { void startCourse() { System.out.println("Joining live class"); } }
public class OnlineCourse {
    public static void main(String[] args) {
        CourseBase c = new VideoCourse(); c.startCourse();
        c = new LiveCourse(); c.startCourse();
    }
}
