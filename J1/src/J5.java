public class J5 {
    public static void main(String[] args){
        String s1="";
        for(int j=3;j<9;j=j+1){
            for(int i=1;i<11;i=i+1){
                s1=s1+j+"*"+i+"="+(j*i)+"\n";
            }
            s1=s1+"\n";
        }


        System.out.println(s1);

    }
}
