class MenuItem { String name; int price; MenuItem(String name, int price) { this.name = name; this.price = price; } }
class RestaurantOrder { int total; void order(MenuItem item) { total += item.price; } void bill() { System.out.println("Total: " + total); } }
public class RestaurantOrdering { public static void main(String[] args) { RestaurantOrder r = new RestaurantOrder(); r.order(new MenuItem("Pizza",250)); r.order(new MenuItem("Burger",150)); r.bill(); } }
