package com.sangamone;
class Bird{
    String colour;
    int feet=2;
    boolean canFly=true;
}
public class J36 {
    public static void main(String[] args){
        Bird parrot1=new Bird();
        Bird crow1=new Bird();
        parrot1.colour="Green";
        crow1.colour="Black";

        System.out.println("Parrot");
        System.out.println("Colour     :" + parrot1.colour);
        System.out.println("No of Feet :" + parrot1.feet);
        System.out.println("Can it fly?:" + parrot1.canFly);
        System.out.println();

        System.out.println("Crow");
        System.out.println("Colour     :" + crow1.colour);
        System.out.println("No of Feet :" + crow1.feet);
        System.out.println("Can it fly?:" + crow1.canFly);
        System.out.println();
    }
}
