class BonusEmployee { void bonus(int salary) { System.out.println("Bonus"); } }
class BonusDeveloper extends BonusEmployee { void bonus(int salary) { System.out.println("Bonus: " + (salary * 20 / 100)); } }
class BonusTester extends BonusEmployee { void bonus(int salary) { System.out.println("Bonus: " + (salary * 10 / 100)); } }
public class EmployeeBonus {
    public static void main(String[] args) { BonusEmployee e = new BonusDeveloper(); e.bonus(50000); e = new BonusTester(); e.bonus(40000); }
}
