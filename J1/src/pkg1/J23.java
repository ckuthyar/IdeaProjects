package pkg1;

public class J23 {
    public static void main(String[] args){
        String time1="";
        for(int j=0;j<12;j++){
            for(int i=0;i<12;i++){
                time1=(9+j)+":"+(i*5);
                System.out.println(time1);
            }
            System.out.println();
        }
    }
}
