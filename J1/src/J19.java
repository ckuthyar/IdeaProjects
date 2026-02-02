import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class J19 {
    public static void main(String[] args)throws FileNotFoundException,IOException{
        File f1=new File("in4.txt");
        FileWriter fw1=new FileWriter("out4.txt");
        String out1="";
        Scanner sc1=new Scanner(f1);
        String s1=sc1.nextLine();
        String[] arr1=s1.split(",");
        int num1=Integer.parseInt(arr1[0]);
        int num2=Integer.parseInt(arr1[1]);
        out1=J14.table3(num1,num2);
        System.out.println(out1);
        fw1.write(out1);
        fw1.close();
    }
}
