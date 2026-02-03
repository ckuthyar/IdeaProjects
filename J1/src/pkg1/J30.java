package pkg1;

public class J30 {
    public static void main(String[]args){
        System.out.println("School Clock angle");
        String time1="";
        for(int j=0;j<12;j++){
            for(int i=0;i<12;i++){
                time1=(j+9)+":"+(i*5);
                System.out.println(time1);  //9:00
            }
            System.out.println();
        }
    }
}

