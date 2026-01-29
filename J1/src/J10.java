import java.util.Scanner;
public class J10 {
    public static String reverse1(){
        System.out.println("Enter any String");
        String s2="";
        Scanner sc1=new Scanner(System.in);
        String s1=sc1.nextLine();
        int len1=s1.length();
        for(int i=1;i<len1+1;i++){
            s2=s2+s1.charAt(len1-i);
        }
        return s2;
    }
    public static void main(String[] args){
        String result=reverse1();
        System.out.println(result);
    }
}
