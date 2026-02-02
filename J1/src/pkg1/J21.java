package pkg1;

public class J21 {
    public static void main(String[] args){
        System.out.println("School Clock Angle");
        double angle1=0.0;
        for(int i=0;i<12;i++){
            angle1=90+i*30-i*2.5;
            System.out.println(angle1%360);
        }
        System.out.println();
        for(int i=0;i<12;i++){
            angle1=60+i*30-i*2.5;
            System.out.println(angle1%360);
        }
        System.out.println();
        for(int i=0;i<12;i++){
            angle1=30+i*30-i*2.5;
            System.out.println(angle1%360);
        }
        System.out.println();

    }
}
