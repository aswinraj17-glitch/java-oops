class Member { void discount(int price) { System.out.println("Discount"); } }
class NormalMember extends Member { void discount(int price) { System.out.println("Final: " + (price - price * 5 / 100)); } }
class SilverMember extends Member { void discount(int price) { System.out.println("Final: " + (price - price * 10 / 100)); } }
class GoldMember extends Member { void discount(int price) { System.out.println("Final: " + (price - price * 20 / 100)); } }
public class ShoppingMembership { public static void main(String[] args) { Member m = new GoldMember(); m.discount(1000); } }
