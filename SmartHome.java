abstract class SmartDevice { abstract void turnOn(); abstract void turnOff(); }
class SmartLight extends SmartDevice { void turnOn() { System.out.println("Light ON"); } void turnOff() { System.out.println("Light OFF"); } }
class SmartFan extends SmartDevice { void turnOn() { System.out.println("Fan ON"); } void turnOff() { System.out.println("Fan OFF"); } }
public class SmartHome { public static void main(String[] args) { SmartDevice d = new SmartLight(); d.turnOn(); d.turnOff(); d = new SmartFan(); d.turnOn(); d.turnOff(); } }
