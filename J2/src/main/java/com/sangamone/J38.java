package com.sangamone;
class Car{
    public void getSpeed(int maxSpeed){
        System.out.println("Maximum speed is : "+maxSpeed);
    }
}
public class J38 {
    public static void main(String[] args){
        Car maruti1 = new Car();
        Car thar1 = new Car();
        Car bmw1 = new Car();
        Car benz1 = new Car();
        Car volvo1 = new Car();
        Car lamborghini1 = new Car();

        maruti1.getSpeed(100);
        thar1.getSpeed(120);
        bmw1.getSpeed(140);
        benz1.getSpeed(160);
        volvo1.getSpeed(180);
        lamborghini1.getSpeed(200);
    }
}
