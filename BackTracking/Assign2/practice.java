package BackTracking.Assign2;

public class practice {

    static final char[][] L= {{},{},
    {'a','b','c'},{'d','e','f'},
    {'g','h','i'},{'j','k','l'},
    {'m','n','o'},{'p','q','r','s'},
    {'t','u','v'},{'w','x','y','z'}};

    public static void letterCombination(String d){
        int len = d.length();
        if(len == 0){
            System.out.println("Combinations are not possible for these combination");
        }
        bfs(0,len,new StringBuilder(""),d);
    }

    public static void bfs(int pos,int len,StringBuilder s,String d){
        if(pos == len){
            System.out.print(s.toString()+" ");
            return;
        }
        char letters[] = L[Character.getNumericValue(d.charAt(pos))];
        for(int i=0;i<letters.length;i++){
            bfs(pos+1, len, new StringBuilder(s).append(letters[i]), d);
        }
    }
    public static void main(String args[]){
        letterCombination("23");
    }
}
