abstract class EProduct { int price; EProduct(int price) { this.price = price; } abstract int finalPrice(); }
class EBook extends EProduct { EBook(int price) { super(price); } int finalPrice() { return price - 50; } }
class EClothing extends EProduct { EClothing(int price) { super(price); } int finalPrice() { return price - price * 20 / 100; } }
public class ECommerceDiscount { public static void main(String[] args) { EProduct p = new EBook(300); System.out.println(p.finalPrice()); p = new EClothing(1000); System.out.println(p.finalPrice()); } }
