package pkg1;
import java.util.List;
import java.util.ArrayList;
public class J28 {
    public static void main(String[]args){
        System.out.println("Andaman Prisoners");
        int count=10;
        List<Character> prisons=new ArrayList<>();
        List<Integer> lucky=new ArrayList<>();
        for(int i=0;i<count;i++){
            prisons.add(i,'C');
        }
        System.out.println("Opening:"+prisons);
        for(int i=0;i<count;i++){
            prisons.set(i,'O');
        }
        System.out.println("Round1:"+prisons);
        for(int i=1;i<count;i=i+2){
            prisons.set(i,'C');
        }
        System.out.println("Round2:"+prisons);

        for(int j=2;j<count;j++){
            for(int i=j;i<count;i=i+j+1){
                if(prisons.get(i)=='C'){
                    prisons.set(i,'O');
                }
                else{
                    prisons.set(i,'C');
                }
            }
            System.out.println("Round"+(j+1)+":"+prisons);
        }
        for(int i=0;i<count;i++){
            if(prisons.get(i)=='O'){
                lucky.add(i+1);
            }
        }
        System.out.println("Lucky prisoners are "+lucky);
    }
}
