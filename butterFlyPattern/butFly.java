package butterFlyPattern;

public class butFly {
    public static void main(String[] args) {

        int length = 9;
        int n = length/2;
        
        for(int i=1;i<=n;i++){
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int k=1;k<=length-i*2;k++){
                System.out.print(" ");
            }
            //stars
            for(int m=1;m<=i;m++){
                System.out.print("*");
            }
            System.err.println();
        }
        for(int i=n;i>=1;i--){
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int k=1;k<=length-i*2;k++){
                System.out.print(" ");
            }
            //stars
            for(int m=1;m<=i;m++){
                System.out.print("*");
            }
            System.err.println();

        }

    }
}
