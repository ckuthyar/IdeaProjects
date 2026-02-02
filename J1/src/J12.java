public class J12 {
    public static void calc1(int num1, int num2){
        float sum1=num1+num2;
        float dif1=num1-num2;
        float mlt1=num1*num2;
        float div1= (float)num1/num2;
        String s1=sum1+","+dif1+","+mlt1+","+div1;
        System.out.println(s1);
    }
    public static void main(String[] args){
        calc1(8,4);
        calc1(8,5);
        calc1(5,8);
        calc1(10,2);
    }
}
