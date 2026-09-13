class EmployeeBase { String name; int id; void work() { System.out.println("Employee is working"); } }
class Developer extends EmployeeBase { void work() { System.out.println("Developer writes code"); } }
class Tester extends EmployeeBase { void work() { System.out.println("Tester tests the application"); } }
public class EmployeeInheritance {
    public static void main(String[] args) {
        Developer d = new Developer(); d.work();
        Tester t = new Tester(); t.work();
    }
}
