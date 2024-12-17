package RecurrenceAssin;

public class practice {

    static String digits[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};

    public static void digitToNumber(int n){
        if(n == 0)
        {
            return;
        }
        int lastDigit = n%10;
        n = n/10;
        digitToNumber(n);
        System.out.print(digits[lastDigit]+" ");
    }

    public static void OccIndexes(int arr[],int key,int i)
    {
        if(i == arr.length)
        {
            return;
        }
        if(arr[i] == key)
        {
            System.out.print(i+"  ");
        }
        i++;
        OccIndexes(arr, key, i);
    }
    
    public static void subStringCount(int i,int j,String str,StringBuilder newstr,int count){

        if(i == str.length()){
            System.out.println(count);
            return;
        }

        if((j == str.length()))
        {
            subStringCount(i + 1, i + 1, str, new StringBuilder(), count);
            return;
        }
    
        newstr.append(str.charAt(j));
        if(newstr.charAt(0) == newstr.charAt(newstr.length()-1))
        {
            count++;
        }
        subStringCount(i,j+1,str,new StringBuilder(newstr),count);
    }
    public static void main(String[] args) {
        // int arr[] = {7, 2, 7, 5, 6, 2, 7, 2, 2};
        // OccIndexes(arr, 7, 0);
        //digitToNumber(1947);
        String str = "abcab";
        subStringCount(0, 0, str, new StringBuilder(""), 0);
    }
}
