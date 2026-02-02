import java.util.Scanner;
public class J16 {
    public static void main(String[] args){
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=sc1.nextInt();
        System.out.println("Enter second number");
        int num2=sc1.nextInt();
        J14.table2(num1,num2);
    }
}
