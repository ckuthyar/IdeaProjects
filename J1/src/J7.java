public class J7 {
    public static void main(String[] args){
        System.out.println("Reverse name");
        String s1="ABCDEFGHIJKLMN";
        String s2="";
        int len1=s1.length();
        for(int i=1;i<len1+1;i++){
            s2=s2+s1.charAt(len1-i);
        }
        System.out.println(s1);
        System.out.println(s2);
    }
}
