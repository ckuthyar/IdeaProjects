import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class J18 {
    public static void main(String[] args)throws FileNotFoundException{
        File f1=new File("in4.txt");
        Scanner sc1=new Scanner(f1);
        String s1=sc1.nextLine();
        String[] arr1=s1.split(",");
        int num1=Integer.parseInt(arr1[0]);
        int num2=Integer.parseInt(arr1[1]);
        J14.table2(num1,num2);
    }
}
