package com.sangamone;
class Vehicle {
    int speed;
    void move() {
        System.out.println("Car is moving");
    }
}

class Car extends Vehicle {
    int numberOfDoors;
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main() {
        Vehicle v1 = new Vehicle();
        Car c1 = new Car();
        v1.move();
    }
}
