/*Fibonacci Series In Java Programs */
import java.util.Scanner;

public class Q5_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=0, n2=1;
        System.out.print("Enter the range: ");
        int range = sc.nextInt();
        System.out.println(n1);
        System.out.println(n2);
        
        for (int i=2;i<=(range-1);i++){
            int n3=n1+n2;
            System.out.println(n1+"+"+n2+"="+n3);
            n1=n2;
            n2=n3;
        }
    }
}
