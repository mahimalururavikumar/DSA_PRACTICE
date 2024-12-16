package BitManupulation.assign;

public class practice {

    //Swaping of numbers without third variable
    public static void swapNum(int x, int y)
    {
        System.out.println("before swapping x: "+x+" and y: "+y);
        x = x ^ y; // (or)x = x+y
        y = x ^ y; // (or)y = x-y
        x = x ^ y; // (or)x = x-y
        System.out.println("After  swapping x: "+x+" and y: "+y);
    }

    //adding one to an Integer using Binary
    public static int addOne(int n)
    {
        return -~n;
    }
    public static void main(String[] args) {
        System.out.println(addOne(20));
    }
}
