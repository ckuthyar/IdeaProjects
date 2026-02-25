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
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class J5 {
    public static void main(String[] args)throws FileNotFoundException,IOException{
        File f1=new File("in2.txt");
        FileWriter fw1=new FileWriter("out1.txt");
        Scanner sc1=new Scanner(f1);
        String s1=sc1.nextLine();
        String info1="";
        String[] arr1=s1.split(",");
        int num1=Integer.parseInt(arr1[0]);
        int num2=Integer.parseInt(arr1[1]);

        for(int j=num1;j<num2+1;j++){
            for(int i=1;i<11;i++){
                info1=j+"*"+i+"="+(j*i);
                System.out.println(info1);
                fw1.write(info1);
                fw1.write("\n");
            }
            System.out.println();
            fw1.write("\n");
        }
        fw1.close();
    }
}
