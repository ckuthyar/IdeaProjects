package com.sangamone;

public class J10 {
    public static void main(String[] args) {
        double n1 = 8;
        double n2 = 5;
        double sum1 = n1 + n2;
        double dif1 = n1 - n2;
        double mlt1 = n1 * n2;
        double div1 = n1 / n2;
        int div2 = (int)div1;
        int rem1=((int)n1)%(int)n2;
        double exp1=Math.pow(n1,n2);
        System.out.println(sum1 + " " + dif1 + " " + mlt1 + " " + div1 + " "+div2+" "+rem1+ " "+exp1);
    }
}