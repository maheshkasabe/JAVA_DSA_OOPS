package Oops.Principles.Polymorphism;

public class Main {
    public static void main(String[] args) {
        // here which method to call depends upon new Pig(); called as upcasting (overriding)
//        Animal animal = new Dog();
//        Pig dog = new Pig();

        Animal.func();
    }
}
