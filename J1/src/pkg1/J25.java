package pkg1;
import java.util.List;
import java.util.ArrayList;
public class J25 {
    public static void main(String[]args){
        System.out.println("Andaman Prisoners");
        List<Character> prisons=new ArrayList<>();
        for(int i=0;i<10;i++){
            prisons.add(i,'C');
        }
        System.out.println(prisons);
        for(int i=0;i<10;i++){
            prisons.set(i,'O');
        }
        System.out.println(prisons);
        for(int i=1;i<10;i=i+2){
            prisons.set(i,'C');
        }
        System.out.println(prisons);
        for(int i=2;i<10;i=i+3){
            if(prisons.get(i)=='C'){
                prisons.set(i,'O');
            }
            else{
                prisons.set(i,'C');
            }
        }
        System.out.println(prisons);
        for(int i=3;i<10;i=i+4){
            if(prisons.get(i)=='C'){
                prisons.set(i,'O');
            }
            else{
                prisons.set(i,'C');
            }
        }
        System.out.println(prisons);
        for(int i=4;i<10;i=i+5){
            if (prisons.get(i) == 'C') {
                prisons.set(i,'O');
            }
            else{
                prisons.set(i,'C');
            }
        }
        System.out.println(prisons);
    }
}
