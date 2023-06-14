import java.util.Scanner;

//Write a program to print the sum of two numbers entered by user by defining your own method.
public class Q04_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 and num2: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        Add(n1,n2);
    }

    private static void Add(int n1, int n2) {
        int sum=n1+n2;
        System.out.println("The sum is: "+sum);
    }
}
