import java.util.Scanner;

//Write a function to check if a given triplet is a Pythagorean triplet or not.
public class Q12_Triplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the triplet: a, b and d");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        isTriplet(a,b,c);
    }

    private static void isTriplet(int a, int b, int c) {
        if(c*c == ( (a*a)+(b*b))){
            System.out.println("It is pythagorean triplet");
        }
        else{
            System.out.println("It is not a pythagorean triplet");
        }
    }
}
