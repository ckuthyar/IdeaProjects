package com.sangamone;
class MyCar{
    int modelYear;
    String modelName;
    public MyCar(int year, String name){//constructor has same name as class
        modelYear=year;
        modelName=name;
    }
}
public class J39 {
    public static void main(String[] args){
        System.out.println("Java - Constructor"); //initialise object when created
        MyCar c1= new MyCar(1995, "Maruti 800");
        MyCar c2= new MyCar(2001, "Maruti Zen");
        MyCar c3 = new MyCar(2010, "Maruti Swift");
        MyCar c4 = new MyCar(2024, "Maruti Celerio");

        System.out.println(c1.modelName + " was purchased in "+c1.modelYear);
        System.out.println(c2.modelName + " was purchased in "+c2.modelYear);
        System.out.println(c3.modelName + " was purchased in "+c3.modelYear);
        System.out.println(c3.modelName + " was purchased in "+c3.modelYear);

    }
}
