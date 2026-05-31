//Gold Medal Problem. There are 26 students in a class who have scored the following marks in 10th Std as per
// attached file Marks.txt (Name, Gender, RollNo....).Write a Program to read the contents of the file.
// Please print the Gold Medalist (overall top scorer) and
// individual Topper in each subject along with the respective marks.
//
//Amar,M,E80BD46CS0001,English:74,Maths:90,Physics:86,Chemistry:78,Biology:60,PASS
//Babu,M,E80BD46CS0002,English:76,Maths:91,Physics:87,Chemistry:70,Biology:70,PASS
//Charles,M,E80BD46CS0003,English:78,Maths:92,Physics:88,Chemistry:73,Biology:80,PASS
//David,M,E80BD46CS0004,English:80,Maths:93,Physics:89,Chemistry:76,Biology:90,PASS
//Ekalavya,M,E80BD46CS0005,English:82,Maths:94,Physics:90,Chemistry:79,Biology:100,PASS
//Fabin,M,E80BD46CS0006,English:84,Maths:95,Physics:91,Chemistry:82,Biology:90,PASS
//Govind,M,E80BD46CS0007,English:48,Maths:96,Physics:92,Chemistry:85,Biology:80,PASS
//Harnish,M,E80BD46CS0008,English:56,Maths:97,Physics:93,Chemistry:88,Biology:70,PASS
//Irene,F,E80BD46CS0009,English:64,Maths:98,Physics:95,Chemistry:91,Biology:60,PASS
//James,M,E80BD46CS0010,English:72,Maths:99,Physics:96,Chemistry:92,Biology:70,PASS
//Kamaraj,M,E80BD46CS0011,English:80,Maths:100,Physics:97,Chemistry:93,Biology:80,PASS
//Latha,F,E80BD46CS00012,English:88,Maths:99,Physics:98,Chemistry:94,Biology:90,PASS
//Manish,M,E80BD46CS0013,English:70,Maths:98,Physics:99,Chemistry:49,Biology:100,PASS
//Nagesh,M,E80BD46CS0014,English:76,Maths:97,Physics:87,Chemistry:59,Biology:90,PASS
//Omar,M,E80BD46CS0015,English:82,Maths:96,Physics:89,Chemistry:69,Biology:80,PASS
//Padma,F,E80BD46CS0016,English:88,Maths:95,Physics:91,Chemistry:79,Biology:70,PASS
//Queenie,F,E80BD46CS0017,English:60,Maths:94,Physics:93,Chemistry:89,Biology:75,PASS
//Roopa,F,E80BD46CS0018,English:68,Maths:93,Physics:95,Chemistry:79,Biology:80,PASS
//Sundar,M,E80BD46CS0019,English:77,Maths:92,Physics:97,Chemistry:80,Biology:85,PASS
//Tara,F,E80BD46CS0020,English:79,Maths:93,Physics:99,Chemistry:81,Biology:90,PASS
//Ullas,M,E80BD46CS0021,English:75,Maths:94,Physics:87,Chemistry:82,Biology:95,PASS
//Vasu,M,E80BD46CS0022,English:85,Maths:95,Physics:89,Chemistry:83,Biology:90,PASS
//Wendy,F,E80BD46CS0023,English:65,Maths:96,Physics:91,Chemistry:84,Biology:85,PASS
//Xero,M,E80BD46CS0024,English:25,Maths:98,Physics:93,Chemistry:85,Biology:80,PASS
//Yasmin,F,E80BD46CS0025,English:75,Maths:100,Physics:95,Chemistry:86,Biology:85,PASS
//Zafar,M,E80BD46CS0026,English:75,Maths:98,Physics:87,Chemistry:79,Biology:89,PASS

package com.sangamone;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class J9 {
    public static void main(String[] args)throws FileNotFoundException {
        System.out.println("Gold Medal");
        File f1=new File("Marks.txt");
        List<String> names = new ArrayList<>();
        List<String> subjects = new ArrayList<>();

        List<Integer> english = new ArrayList<>();
        List<Integer> maths = new ArrayList<>();
        List<Integer> physics = new ArrayList<>();
        List<Integer> chemistry = new ArrayList<>();
        List<Integer> biology = new ArrayList<>();

        List<String> engToppers = new ArrayList<>();
        List<String> matToppers = new ArrayList<>();
        List<String> phyToppers = new ArrayList<>();
        List<String> cheToppers = new ArrayList<>();
        List<String> bioToppers = new ArrayList<>();

        int engMax=0;
        int matMax=0;


        Scanner sc1=new Scanner(f1);
        String s1="";
        String arr1[];
        String arr2[];

        for(int i=0;i<26;i++){
            s1=sc1.nextLine();
            arr1=s1.split(",");
            names.add(arr1[0]);

            arr2=arr1[3].split(":");
            subjects.add(arr2[0]);
            english.add(Integer.parseInt(arr2[1]));

            arr2=arr1[4].split(":");
            subjects.add(arr2[0]);
            maths.add(Integer.parseInt(arr2[1]));



        }
        engMax=Collections.max(english);
        matMax=Collections.max(maths);

        for(int i=0;i<26;i++){
            if(english.get(i)==engMax){
                engToppers.add(names.get(i));
            }
            if(maths.get(i)==matMax){
                matToppers.add(names.get(i));
            }

        }
        System.out.println(engToppers + " with marks of "+ engMax+ " in "+subjects.get(0));
        System.out.println(matToppers + " with marks of "+ matMax+ " in "+subjects.get(1));


    }
}
