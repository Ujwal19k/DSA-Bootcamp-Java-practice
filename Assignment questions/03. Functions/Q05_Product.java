import java.util.Scanner;

//Define a method that returns the product of two numbers entered by user.
public class Q05_Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 and num2: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        Prod(n1,n2);
    }

    private static void Prod(int n1, int n2) {
        int sum=n1*n2;
        System.out.println("The product is: "+sum);
    }
}
