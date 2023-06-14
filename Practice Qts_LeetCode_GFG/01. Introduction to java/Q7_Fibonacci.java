import java.util.Scanner;

//Q7. To calculate Fibonacci Series up to n numbers.
public class Q7_Fibonacci{
    public static void main(String[] args) {
        int n1=0; int n2=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Limit: ");
        int lim = sc.nextInt();

        System.out.println("\nThe series is: ");
        System.out.println(n1);
        System.out.println(n2);

        for(int i=2;i<=(lim-1);i++){
            int n3=n1+n2;
            System.out.println(n1+"+"+n2+"="+n3);
            n1=n2;
            n2=n3;
        }

    }
}