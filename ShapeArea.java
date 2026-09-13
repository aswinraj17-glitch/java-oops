class ShapeBase { void area() { System.out.println("Area"); } }
class CircleShape extends ShapeBase { void area() { int r = 5; System.out.println("Circle area: " + (3.14 * r * r)); } }
class RectangleShape extends ShapeBase { void area() { int l = 10, b = 5; System.out.println("Rectangle area: " + (l * b)); } }
class TriangleShape extends ShapeBase { void area() { int b = 10, h = 5; System.out.println("Triangle area: " + (0.5 * b * h)); } }
public class ShapeArea {
    public static void main(String[] args) {
        ShapeBase s = new CircleShape(); s.area();
        s = new RectangleShape(); s.area();
        s = new TriangleShape(); s.area();
    }
}
