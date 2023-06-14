import java.util.Scanner;

//Calculate Distance Between Two Points
//Here I will use two point formula which needs x and y co-ordinate of both the end points
public class Q05_Distance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Assuming one end Point as A having Coordinate (x1,y1)
        //Assuming second end Point as B having Coordinate (x2,y2)
        System.out.print("Enter x co-ordinate of point A (x1): "); 
        float x1=sc.nextFloat();
        System.out.print("Enter y co-ordinate of point A (y1): "); 
        float y1=sc.nextFloat();
        System.out.print("Enter x co-ordinate of point B (x2): "); 
        float x2=sc.nextFloat();
        System.out.print("Enter x co-ordinate of point B (y2): "); 
        float y2=sc.nextFloat();

        float distance = (float) Math.sqrt( (Math.pow(x2-x1,2)) + (Math.pow(y2-y1,2)));
        System.out.println("The distance is: "+distance);
    }
}
