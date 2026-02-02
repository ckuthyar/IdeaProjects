import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class J17 {
    public static void main(String[] args)throws FileNotFoundException{
        File f1=new File("in3.txt");
        Scanner sc1=new Scanner(f1);
        int num1=Integer.parseInt(sc1.nextLine());
        int num2=Integer.parseInt(sc1.nextLine());
        J14.table2(num1, num2);
    }
}
