package Abstraction;

public class Car extends Vehicle {


    @Override
    public void run() {
        System.out.println("Run");

    }

    @Override
    public void park() {
        System.out.println("Park");

    }
}
