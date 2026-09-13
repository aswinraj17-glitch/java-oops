class IDCard { void generate() { System.out.println("Generating ID card"); } }
class StudentID extends IDCard { void generate() { System.out.println("Generating Student ID"); } }
class StaffID extends IDCard { void generate() { System.out.println("Generating Staff ID"); } }
public class UniversityIDCard { public static void main(String[] args) { IDCard id = new StudentID(); id.generate(); id = new StaffID(); id.generate(); } }
