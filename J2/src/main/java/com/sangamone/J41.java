package com.sangamone;
class MyVillage{
    public void getHouseDetails(){  //change access modifier from public to private and run
        System.out.println("This is my private house");
    }
    public void getTempleDetails(){
        System.out.println("This is a public temple");
    }
}
public class J41 {
    public static void main(String[] args){
        System.out.println("Access Modifiers - Public, Private, Protected, Default");
        MyVillage mv1=new MyVillage();
        mv1.getHouseDetails();  // to print full details of your private house in your par
        mv1.getTempleDetails(); // to print full details of the public temple in your apartment
    }
}
