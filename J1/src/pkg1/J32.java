package pkg1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class J32 {
    public static void main(String[] args)throws FileNotFoundException{
        File f1=new File("marks.txt");
        Scanner sc1=new Scanner(f1);
        List<String> names=new ArrayList<>();
        List<String> english=new ArrayList<>();
        String s1="";
        String[] arr1;
        while(sc1.hasNext()){
            s1=sc1.nextLine();
            arr1=s1.split(",");
            names.add(arr1[0]);
            english.add(arr1[3]);
        }
        System.out.println(names);
        System.out.println(english);
    }
}
