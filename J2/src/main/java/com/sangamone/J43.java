package com.sangamone;

public class J43 {
    public static void checkIfPalindrome1(String s1){
        boolean isPalin=true;
        int len1=0;
        char c1;
        char c2;

        len1=s1.length();
        if (len1%2==0){
            isPalin=false;
        }
        for(int i=0;i<(len1/2)+1;i++){
            c1=s1.charAt(i);
            c2=s1.charAt(len1-(i+1));
            //System.out.println(c1+"-"+c2+" "+isPalin);
            if(c1!=c2){
                isPalin=false;
            }
        }
        if(isPalin){
            System.out.println(s1+" is a Palindrome");
        }
    }
    public static void main(String[] args){
        System.out.println("Palindrome Check");
        checkIfPalindrome1("madam");
        checkIfPalindrome1("malayalam");
        checkIfPalindrome1("Madam");
        checkIfPalindrome1("malayalams");
    }
}
