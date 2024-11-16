package Oops.abstraction;

public class Child extends AbstarctDemo {
    void fun(){
        System.out.println("hello ");
    }

    void call(){
        System.out.println("cal ...");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.fun();
        c.call();
    }
}
