//Andaman Prisoner Problem - There are 100 prison cells in a row. All cells are locked. Jailer is given permission
// by the Prime Minister of India to release any number of prisoners.
//In Round 1, Jailer opens all the doors.
//In Round 2, he closes every alternate door (2, 4, 6...).
//In Round 3, every third door (3, 6, 9,....) if Door is Open,, he closes it. If Door is Closed, he opens it.
//In Round 4, every fourth door (4, 8, 12..), if Door is open,, he closes it. If Door is Closed, he opens it.
//He does this for 100 Rounds. At the end, who are the lucky prisoners ?
//b) Prepare 2 letters. Letter 1 to PM giving list of lucky prisoners and release date as of today.
//Letter 2 to Jailer giving a list of unlucky prisoners who will be released after 4 weeks.
package com.sangamone;
import java.util.List;
import java.util.ArrayList;
public class J8 {
    public static void main(String[] args){
        System.out.println("Andaman Prisoner");
        int count=100;
        List<String> prisons=new ArrayList<>();
        List<Integer> lucky = new ArrayList<>();
        for(int i=0;i<count;i++){
            prisons.add("C");
        }
        //System.out.println("Opening : "+prisons);

        for(int i=0;i<count;i++){
            prisons.set(i,"O");
        }
        //System.out.println("Round1 :  "+prisons);

        for(int i=1;i<count;i=i+2){
            prisons.set(i,"C");
        }
        //System.out.println("Round2 :  "+prisons);
        for(int j=2;j<count;j++){
            for(int i=j;i<count;i=i+j+1){
                if(prisons.get(i).equals("C")){
                    prisons.set(i,"O");
                }else{
                    prisons.set(i,"C");
                }
            }
            //System.out.println("Round"+ String.valueOf(j)+ " :  "+prisons);
        }
        for(int i=0;i<count;i++){
            if(prisons.get(i).equals("O")){
                lucky.add(i+1);
            }
        }
        System.out.println(lucky +"are the lucky prisoners");
    }
}
