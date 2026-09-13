class Animal { void sound() { System.out.println("Animal sound"); } }
class Dog extends Animal { void sound() { System.out.println("Dog says Woof"); } }
class Cat extends Animal { void sound() { System.out.println("Cat says Meow"); } }
class Cow extends Animal { void sound() { System.out.println("Cow says Moo"); } }
public class AnimalSound { public static void main(String[] args) { Animal a = new Dog(); a.sound(); a = new Cat(); a.sound(); a = new Cow(); a.sound(); } }
