package pkg1;

public class J31 {
    public static void getAngle(){
        String time1="";
        double angle1=0.0;
        for(int j=0;j<12;j++){
            for(int i=0;i<12;i++){
                time1=(j+9)+":"+(i*5);
                angle1=Math.abs((90-j*30)+i*30-i*2.5);
                System.out.println(time1+" : "+angle1%360);  //9:00
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        System.out.println("School Clock angle");
        getAngle();

    }
}

