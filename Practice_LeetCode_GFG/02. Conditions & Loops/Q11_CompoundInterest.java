import java.util.Scanner;

//Compound Interest Java Program
public class Q11_CompoundInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Principal ammount (P): ");
        double p=sc.nextDouble();
        System.out.print("Enter annual rate interest (R): ");
        double r=sc.nextDouble();
        System.out.print("Enter frequency or the number of times interest is compounded in a  year (n): ");
        int n=sc.nextInt();
        System.out.print("Enter  number of years (t): ");
        int t=sc.nextInt();

        double newamt = p*Math.pow((1+(r/n)), n*t);
        System.out.println("The new ammount is: "+newamt);

        double ci = newamt-p;
        System.out.println("The "+ci);
    }
}

//this program is mostly wrong because of calculation error from my side
