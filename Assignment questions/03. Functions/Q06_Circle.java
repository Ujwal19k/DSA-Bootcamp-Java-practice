import java.util.Scanner;
//Write a program to print the circumference and area of a circle of 
//radius entered by user by defining your own method.
public class Q06_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        float rad=sc.nextFloat();
        circum(rad);
        circArea(rad);

    }

    private static void circArea(float rad) {
        float areac=(float) (rad*rad*Math.PI);
        System.out.println("The circumference is: "+areac);
    }

    private static void circum(float rad) {
        float circum=(float) (2*rad*Math.PI);
        System.out.println("The circumference is: "+circum);

    }
}
