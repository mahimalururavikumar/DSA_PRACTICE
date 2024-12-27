package ArrayList;
import java.util.*;

public class practice {

    public static Boolean rotatedArrayTarget(ArrayList<Integer> list,int target){
        int n = list.size();
        int bp = -1;
        for(int i=0;i<n-1;i++){
            if(list.get(i)>list.get(i+1)){
                bp = i;
                break;
            }
        }
        int lp = bp+1;
        int rp = bp;
        while (lp != rp) {
            if((list.get(lp)+list.get(rp)) == target){
                return true;
            }
            if((list.get(lp)+list.get(rp)) > target){
                rp = (n+rp-1) % n;
            }else{
                lp = (lp+1) % n;
            }
        }
        return false;
    }

    public static boolean findTarget(ArrayList<Integer> list,int target){
        int lp = 0, rp = list.size()-1;
        while (lp<rp) {
            if((list.get(lp)+list.get(rp)) == target){
                return true;
            }else if((list.get(lp)+list.get(rp)) > target){
                rp--;
            }else{
                lp++;
            }
        }
        return false;
    }

    public static int optimizedstore(ArrayList<Integer> list){
        int maxWater = 0;
        int lp = 0, rp = list.size()-1;
        while(lp<rp){
            int ht = Math.min(list.get(lp), list.get(rp));
            int width = rp-lp;
            int currWidth = ht * width;
            maxWater = Math.max(maxWater, currWidth);
            if(list.get(lp)<list.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }

    public static int storeWater(ArrayList<Integer> height){
        int maxWater = 0;
        for(int i=0;i<height.size();i++){
            for(int j=1+i;j<height.size();j++){
                int ht = Math.min(height.get(i), height.get(j));
                int width = j-i;
                int currWidth = ht * width;
                maxWater = Math.max(maxWater, currWidth);
            }
        }
        return maxWater;
    }
    public static void main(String args[]){

        ArrayList<Integer> mainlist = new ArrayList<>();
        mainlist.add(11);
        mainlist.add(15);
        mainlist.add(6);
        mainlist.add(8);
        mainlist.add(9);
        mainlist.add(10);
        System.out.print(rotatedArrayTarget(mainlist,25));
    }
}
