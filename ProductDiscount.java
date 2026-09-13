class DiscountProduct { void discount(int price) { System.out.println(price); } }
class Electronics extends DiscountProduct { void discount(int price) { System.out.println("Final price: " + (price - price * 10 / 100)); } }
class Clothing extends DiscountProduct { void discount(int price) { System.out.println("Final price: " + (price - price * 20 / 100)); } }
public class ProductDiscount { public static void main(String[] args) { DiscountProduct p = new Electronics(); p.discount(10000); p = new Clothing(); p.discount(2000); } }
