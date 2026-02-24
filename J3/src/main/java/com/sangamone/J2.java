//Assignment - Create Mathematical Tables from 3 to 20
//        3 * 1 = 3
//        3 * 2 = 6
//
//        3 * 10 = 30      Put a line break
//
//        4 * 1 = 4
//        4 * 2 = 8
//        4 * 10 = 40      Put a line break
//
//        20 * 1 = 20
//        20 * 2 = 40
//        20 * 10 =200     Put a line break

package com.sangamone;
public class J2 {
    public static void main(String[] args){
        System.out.println("Mathematical Tables");
        for(int j=3;j<6;j++){
            for(int i=1;i<11;i++){
                System.out.println(j + "*" + i + "=" + j*i);
            }
            System.out.println();
        }
    }
}
