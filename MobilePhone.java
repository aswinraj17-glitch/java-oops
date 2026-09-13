class Mobile {
    private int battery = 50;
    void charge(int amount) { battery += amount; if (battery > 100) battery = 100; }
    void use(int amount) { if (amount <= battery) battery -= amount; }
    void showBattery() { System.out.println("Battery: " + battery + "%"); }
}
public class MobilePhone { public static void main(String[] args) { Mobile m = new Mobile(); m.charge(30); m.use(20); m.showBattery(); } }
