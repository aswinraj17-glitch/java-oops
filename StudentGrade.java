class GradeStudent {
    String name; int marks;
    GradeStudent(String name, int marks) { this.name = name; this.marks = marks; }
    void calculateGrade() {
        if (marks >= 90) System.out.println(name + " Grade A");
        else if (marks >= 75) System.out.println(name + " Grade B");
        else if (marks >= 50) System.out.println(name + " Grade C");
        else System.out.println(name + " Fail");
    }
}
public class StudentGrade {
    public static void main(String[] args) { GradeStudent s = new GradeStudent("Student", 85); s.calculateGrade(); }
}
