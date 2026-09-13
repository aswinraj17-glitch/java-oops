class HospitalWorker { void work() { System.out.println("Staff is working"); } }
class Doctor extends HospitalWorker { void work() { System.out.println("Doctor treats patients"); } }
class Nurse extends HospitalWorker { void work() { System.out.println("Nurse takes care of patients"); } }
public class HospitalStaff {
    public static void main(String[] args) {
        HospitalWorker staff = new Doctor(); staff.work();
        staff = new Nurse(); staff.work();
    }
}
