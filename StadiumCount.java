class Stadium {
    int capacity, currentPeople;
    Stadium(int capacity) { this.capacity = capacity; }
    void enter() { if (currentPeople < capacity) currentPeople++; }
    void exit() { if (currentPeople > 0) currentPeople--; }
    void showCount() { System.out.println("People inside: " + currentPeople); }
}
public class StadiumCount {
    public static void main(String[] args) {
        Stadium stadium = new Stadium(50000);
        stadium.enter(); stadium.enter(); stadium.enter(); stadium.exit();
        stadium.showCount();
    }
}
