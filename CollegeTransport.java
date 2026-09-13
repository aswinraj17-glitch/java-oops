class Transport { void fee() { System.out.println("Transport fee"); } }
class BusTransport extends Transport { void fee() { System.out.println("Bus fee: 1000"); } }
class VanTransport extends Transport { void fee() { System.out.println("Van fee: 1500"); } }
class CabTransport extends Transport { void fee() { System.out.println("Cab fee: 2000"); } }
public class CollegeTransport { public static void main(String[] args) { Transport t = new BusTransport(); t.fee(); t = new VanTransport(); t.fee(); t = new CabTransport(); t.fee(); } }
