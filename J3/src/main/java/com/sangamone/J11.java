package com.sangamone;

public class J11 {
    public static void calc(double n1, double n2){
        double sum1 = n1 + n2;
        double dif1 = n1 - n2;
        double mlt1 = n1 * n2;
        double div1 = n1 / n2;
        int div2 = (int)div1;
        int rem1=((int)n1)%(int)n2;
        double exp1=Math.pow(n1,n2);
        System.out.println(sum1 + " " + dif1 + " " + mlt1 + " " + div1 + " "+div2+" "+rem1+ " "+exp1);
    }
    public static void main(String[] args) {
        calc(8,4);
        calc(8,5);

    }
}