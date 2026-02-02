package pkg1;
public class J24 {
    public static void main(String[] args){
        String time1="";
        double angle1=0.0;
        for(int j=0;j<12;j++){
            for(int i=0;i<12;i++){
                time1=(9+j)+":"+(i*5);
                angle1=Math.abs((90-j*30)+i*30-i*2.5);
                System.out.println(time1+" - "+angle1%360);
            };
            System.out.println();
        }
    }
}
