import java.util.Scanner;
public class J9 {
    public static void main(String[]args){
        System.out.println("Reversing a String");
        Scanner sc1=new Scanner(System.in);
        String s1="ABCDEF";
        String s2="";
        int len1=s1.length();
        for(int i=0;i<len1;i++){
            s2=s2+s1.charAt(len1-1-i);
        }
        System.out.println(s2);
    }
}
