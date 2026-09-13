class Printer { void print() { System.out.println("Printing"); } }
class LaserPrinter extends Printer { void print() { System.out.println("Printing using laser"); } }
class InkjetPrinter extends Printer { void print() { System.out.println("Printing using inkjet"); } }
public class PrinterSystem { public static void main(String[] args) { Printer p = new LaserPrinter(); p.print(); p = new InkjetPrinter(); p.print(); } }
