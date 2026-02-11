package pkg1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class J33 {
    public static void main(String[] args)throws FileNotFoundException{
        File f1=new File("marks.txt");
        Scanner sc1=new Scanner(f1);
        List<String> names=new ArrayList<>();
        List<Integer> english=new ArrayList<>();
        String s1="";
        String[] arr1;
        String[] arr2;
        int maxEng;
        int marks1=0;
        while(sc1.hasNext()){
            s1=sc1.nextLine();
            arr1=s1.split(",");
            names.add(arr1[0]);
            arr2=arr1[3].split(":");
            marks1=Integer.parseInt(arr2[1]);
            english.add(marks1);
        }
        System.out.println(names);
        System.out.println(english);
        maxEng=Collections.max(english);
        System.out.println(maxEng);
    }

}
