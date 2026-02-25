package com.sangamone;

public class J7 {
    public static void main(String[] args){
        System.out.println("School Clock Angle");
        String time1="";
        String angle1="";
        for(int j=0;j<12;j++){
            for(int i=0;i<12;i++){
                time1=String.valueOf(j+9)+":"+String.valueOf(i*5);
                angle1=String.valueOf(Math.abs(90-(j*30)+i*30-i*2.5)%360);
                System.out.println(time1+" - "+angle1);
            }
            System.out.println();
        }
    }
}
