package Recursion2;

public class practice {

    //Tailing problem
    public static int tilling(int n)
    {
        if(n == 0 || n == 1)
        {
            return 1;
        }
        //horizontal
        int hztail = tilling(n-2);
        //vertical
        int vrtail = tilling(n-1);

        return (hztail+vrtail);
    }

    //REmove duplicates from string
    public static void removeduplicates(String str,int idx,StringBuilder newstr,boolean map[])
    {
        if(idx == str.length())
        {
            System.out.println(newstr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true)
        {
            removeduplicates(str, idx+1, newstr, map);
        }else{
            map[currChar -'a'] = true;
            newstr = newstr.append(currChar); 
            removeduplicates(str, idx+1, newstr, map);
        }
    }
    
    //N friends pairing problem 
    public static int friendPairing(int n)
    {
        if(n == 1 || n==2)
        {
            return n;
        }
        return friendPairing(n-1) + (n-1)*friendPairing(n-2);
    }

    
    public static void main(String[] args) {
        //String str ="madam";
        //removeduplicates(str, 0,new StringBuilder(""), new boolean[26]);
        System.out.println(friendPairing(4));
    }
}
