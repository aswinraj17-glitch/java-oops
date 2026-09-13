class FineCalculator { void calculateFine(int days) { if (days > 0) System.out.println("Fine: " + (days * 5)); else System.out.println("No fine"); } }
public class LibraryFine { public static void main(String[] args) { FineCalculator f = new FineCalculator(); f.calculateFine(4); } }
