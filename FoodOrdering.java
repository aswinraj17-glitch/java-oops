class FoodItem { String name; int price; FoodItem(String name, int price) { this.name = name; this.price = price; } }
class Restaurant { int total; void order(FoodItem food) { total += food.price; } void showBill() { System.out.println("Total bill: " + total); } }
public class FoodOrdering {
    public static void main(String[] args) {
        FoodItem f1 = new FoodItem("Pizza", 250); FoodItem f2 = new FoodItem("Burger", 150);
        Restaurant r = new Restaurant(); r.order(f1); r.order(f2); r.showBill();
    }
}
