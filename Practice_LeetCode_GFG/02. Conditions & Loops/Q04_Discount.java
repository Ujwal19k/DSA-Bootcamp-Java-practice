import java.util.Scanner;

//Calculate Discount Of Product
public class Q04_Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter MRP of the product: ");
        double mrp=sc.nextDouble();
        System.out.print("Enter the discount (in %) that you want to apply: ");
        int dis=sc.nextInt();

        double disprice = (((double)dis/100)*mrp);
        System.out.println("The discounted price is: " + disprice);
        System.out.println("The Final price after discount is: " + (mrp-disprice));
    }
}


