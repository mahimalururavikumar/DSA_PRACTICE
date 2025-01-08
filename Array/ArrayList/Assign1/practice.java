package Array.ArrayList.Assign1;

import java.util.ArrayList;

public class practice {
    
    public static Boolean montoneArrList(ArrayList<Integer> ArrList){

        int i = 0,j = ArrList.size()-1;
        boolean inc = true;
        boolean dec = true;

        while (i != j) {
            
            i++;
        }

        while (i!= j) {
            if(ArrList.get(i) > ArrList.get(i+1)){
                inc = false;
            }

            if(ArrList.get(i) < ArrList.get(i+1)){
                dec = false;
            }
            i++;
        }
        return inc || dec;

    }

        
    public static void main(String[] args) {
        ArrayList<Integer> mainlist = new ArrayList<>();
        mainlist.add(9);
        mainlist.add(8);
        mainlist.add(7);
        mainlist.add(6);
        mainlist.add(5);
        mainlist.add(1);

        System.out.println(montoneArrList(mainlist));
    }
}
