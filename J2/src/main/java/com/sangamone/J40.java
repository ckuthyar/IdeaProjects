package com.sangamone;
class MyVehicle{
    int modelYear;
    String modelName;
    public MyVehicle(int modelYear, String modelName){//Constructor
        this.modelYear=modelYear; //this keyword. RHS is the input paramter for the constructor
        this.modelName=modelName; //this. LHS refers to the current object in the constructor
    }
}
public class J40 {
    public static void main(String[] args){
        System.out.println("Constructor with 'this' keyword");
        MyVehicle v1=new MyVehicle(1992, "Kinetic Honda");
        MyVehicle v2=new MyVehicle(2003, "Bajaj Wave");

        System.out.println(v1.modelName+ " was purchased in "+v1.modelYear);
        System.out.println(v2.modelName+ " was purchased in "+v2.modelYear);


    }
}
