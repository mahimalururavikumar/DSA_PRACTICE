package OOPS;

public class practice {
    
    public static void main(String[] args) {
        
        Pen p1 = new Pen();
        p1.setTip(5);
        p1.size[0] = 1;
        p1.size[1] = 2;
        p1.size[2] = 3;
        //p1.setColor("Blue");
        System.out.println(p1.getColor());
        // System.out.println(p1.tip);
        Pen p2 = new Pen(p1);
        p1.size[1] = 10;
        for(int i=0;i<3;i++)
        {
            System.out.println(p2.size[i]);
        }
        
    }
}

class Pen{

    String color;
    int tip;
    int size[];
    //Shallow copy
    Pen (Pen p1){
        size = new int[3];
        this.color = p1.color;
        this.tip = p1.tip;
        this.size = p1.size;
    }

    //Deep copy
    // Pen (Pen p1){
    //     size = new int[3];
    //     this.color = p1.color;
    //     this.tip = p1.tip;
    //     for(int i=0;i<3;i++)
    //     {
    //         this.size[i] = p1.size[i];
    //     }
    // }
    Pen(){
        size = new int[3];
    }
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void setColor(String newColor)
    {
        color = newColor;
    }

    void setTip(int newTip)
    {
        tip = newTip;
    }
}