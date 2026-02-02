public class J14 {
    public static void table2(int num1,int num2){
        String s1="";
        for(int j=num1;j<num2+1;j++){
            for(int i=1;i<11;i++){
                s1=s1+j+"*"+i+"="+(j*i)+"\n";
            }
            s1=s1+"\n";
        }
        System.out.println(s1);
    }
    public static String table3(int num1,int num2){
        String s1="";
        for(int j=num1;j<num2+1;j++){
            for(int i=1;i<11;i++){
                s1=s1+j+"*"+i+"="+(j*i)+"\n";
            }
            s1=s1+"\n";
        }
        return s1;
    }

}
