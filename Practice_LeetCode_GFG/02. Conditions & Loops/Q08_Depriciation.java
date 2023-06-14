import java.util.Scanner;

//Calculate Depreciation of Value
public class Q08_Depriciation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the initial ammount: ");
        double iamt=sc.nextDouble();
        System.out.print("Enter the final ammount: ");
        float famt=sc.nextFloat();

        float dep=(float)(100*((iamt-famt)/iamt));
        System.out.println("The depriciated ammount is: "+(iamt-famt)+" and the depriciation is "+dep+" %");

    }
}
