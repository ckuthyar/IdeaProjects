//Assignment - School Clock Angle
//School Clock is showing 9 am.  Compute the angle between the Hour hand and the Minute hand.  It should show
//Time: Angle in Degrees from 9:00 am to 8:55 pm with a spacing of 5 minutes.
//1) What is the exact angle between Hour Hand and Minute Hand at 9 am ?
//2) What is the exact angle between Hour Hand and Minute Hand at 9:05 pm ?
//3) What is the exact angle between Hour Hand and Minute Hand at 9:10 pm ?
//4) What is the exact angle between Hour Hand and Minute Hand at 9:15 pm ?
//5) What is the speed of the hour hand ? ie
//  In one hour, how many degrees does it move ?
//  In one minute, how many degrees does it move ?
//  In 5 minutes, how many degrees does it move ?
//
//Output should be
//        09:00 - 90 degrees
//        09:05 -  ...   degrees
//        09:10 -  ....  degrees
//        .........
//        9:55 -
//
//        10:00 -
//        10:05 -
//        .........
//        10:55 -

package com.sangamone;

public class J6 {
    public static void main(String[] args){
        System.out.println("School Clock Angle");
        double angle1=0.0;
        for(int j=0;j<12;j++){
            for(int i=1;i<12;i++){
                angle1=(90-(j*30)+i*30-i*2.5);
                System.out.println(Math.abs(angle1%360));
            }
            System.out.println();
        }
    }
}
