public class J13 {
    public static void table1(int num1,int num2){
        String s1="";
        for(int j=num1;j<num2+1;j++){
            for(int i=1;i<11;i++){
                s1=s1+j+"*"+i+"="+(j*i)+"\n";
            }
            s1=s1+"\n";
        }
        System.out.println(s1);
    }
    public static void main(String[] args){
        table1(3,20);
        table1(40,45);

    }
}
