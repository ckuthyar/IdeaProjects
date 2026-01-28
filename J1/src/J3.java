public class J3 {
    public static String calc1(int num1,int num2){
        int sum1=num1+num2;
        int dif1=num1-num2;
        int mlt1=num1*num2;
        int div1=num1/num2;
        System.out.println(sum1+","+dif1+","+mlt1+","+div1);
        return "success";
    }
    public static void main(String[] args){
        calc1(8,4);
        calc1(8,5);
        calc1(10,2);


    }
}
