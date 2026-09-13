class CampusProduct {
    protected String name; protected int price; protected boolean sold;
    CampusProduct(String name, int price) { this.name = name; this.price = price; }
    void showDetails() { System.out.println(name + " - " + price); }
    void sell() { if (!sold) { sold = true; System.out.println(name + " sold"); } else System.out.println("Already sold"); }
}
class CampusBook extends CampusProduct { CampusBook(String name, int price) { super(name, price); } }
class CampusCalculator extends CampusProduct { CampusCalculator(String name, int price) { super(name, price); } }
class CampusCycle extends CampusProduct { CampusCycle(String name, int price) { super(name, price); } }
public class CampusMartProduct { public static void main(String[] args) { CampusProduct p = new CampusBook("Java Book",300); p.showDetails(); p.sell(); p.sell(); } }
