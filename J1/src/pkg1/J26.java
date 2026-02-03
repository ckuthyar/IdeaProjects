package pkg1;
import java.util.List;
import java.util.ArrayList;
public class J26 {
    public static void main(String[]args){
        System.out.println("Andaman Prisoners");
        List<Character> prisons=new ArrayList<>();
        for(int i=0;i<10;i++){
            prisons.add(i,'C');
        }
        System.out.println("Opening:"+prisons);
        for(int i=0;i<10;i++){
            prisons.set(i,'O');
        }
        System.out.println("Round1:"+prisons);
        for(int i=1;i<10;i=i+2){
            prisons.set(i,'C');
        }
        System.out.println("Round2:"+prisons);

        for(int j=2;j<10;j++){
            for(int i=j;i<10;i=i+j+1){
                if(prisons.get(i)=='C'){
                    prisons.set(i,'O');
                }
                else{
                    prisons.set(i,'C');
                }
            }
            System.out.println("Round"+(j+1)+":"+prisons);
        }
    }
}
