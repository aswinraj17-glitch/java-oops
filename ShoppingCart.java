class CartProduct {
    String name; int price;
    CartProduct(String name, int price) { this.name = name; this.price = price; }
}
class ShoppingCart {
    int total;
    void addProduct(CartProduct p) { total += p.price; System.out.println(p.name + " added"); }
    void showTotal() { System.out.println("Total: " + total); }
}
public class ShoppingCart {
    public static void main(String[] args) {
        CartProduct p1 = new CartProduct("Laptop", 50000);
        CartProduct p2 = new CartProduct("Mouse", 1000);
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(p1); cart.addProduct(p2); cart.showTotal();
    }
}
