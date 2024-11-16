package Oops.interfaces;

public class Car implements Engine , Brake{

    @Override
    public void brake() {
        System.out.println("I brake");
    }

    @Override
    public void start() {
        System.out.println("I Start engine of a car");
    }

    @Override
    public void stop() {
        System.out.println("I Stop engine of a car");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate a car");
    }
}
