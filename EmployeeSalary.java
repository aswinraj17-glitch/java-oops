class SalaryEmployee { void calculateSalary() { System.out.println("Employee salary"); } }
class SalaryDeveloper extends SalaryEmployee { void calculateSalary() { System.out.println("Developer salary: 50000"); } }
class SalaryTester extends SalaryEmployee { void calculateSalary() { System.out.println("Tester salary: 40000"); } }
public class EmployeeSalary {
    public static void main(String[] args) {
        SalaryEmployee e = new SalaryDeveloper(); e.calculateSalary();
        e = new SalaryTester(); e.calculateSalary();
    }
}
