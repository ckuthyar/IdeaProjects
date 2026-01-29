import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class J11 {
    public static void main(String[] args) throws FileNotFoundException{
        String s2="";
        File f1=new File("in1.txt");
        Scanner sc1=new Scanner(f1);
        String s1=sc1.nextLine();
        int len1=s1.length();
        for(int i=1;i<len1+1;i++){
            s2=s2+s1.charAt(len1-i);
        }
        System.out.println(s2);
    }
}
