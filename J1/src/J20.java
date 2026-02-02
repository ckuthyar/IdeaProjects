public class J20 {
    public static void reverse1(String s1){
        String s2="";
        int len1=s1.length();
        for (int i=1;i<len1+1;i++){
            s2=s2+s1.charAt(len1-i);
        }
        System.out.println(s2);
    }
    public static void main(String[] args){
        reverse1("Fun with Programming");
        reverse1("SMVITM");

    }
}
