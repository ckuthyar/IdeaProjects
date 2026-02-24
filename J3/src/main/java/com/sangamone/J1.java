//We will do Assignment 1 -   Simple Calculator
//Take 2 numbers :
//int num1 = 8
//int num2 = 4
//We will compute sum, difference, product, division, integer division, remainder, exponential.
//We will create a method and call that method
package com.sangamone;

public class J1 {
    public static void calc1(int num1, int num2){
        int sum1=num1+num2;
        int dif1=num1-num2;
        int mlt1=num1*num2;
        int div1=num1/num2;
        int rem1=num1%num2;
        double exp1=Math.pow(num1,num2);
        System.out.println(sum1+" "+dif1+" "+mlt1+" "+div1+" "+rem1+" "+exp1);
    }
    public static void main(String[] args){
        System.out.println("Simple Calculator");
        calc1(8,4);
        calc1(8,5);
        calc1(5,8);



    }
}
