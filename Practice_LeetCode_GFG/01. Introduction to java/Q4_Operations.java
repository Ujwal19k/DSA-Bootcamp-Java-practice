import java.util.Scanner;

//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class Q4_Operations{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        int n2=sc.nextInt();
        System.out.println("Enter any Operator from +, -, *, /");
        char op = sc.next().charAt(0);
        /*In the code char op = sc.next().charAt(0);, sc.next() is used to read a 
        string input from the user, and charAt(0) is used to extract the first 
        character of the string. This is because the user is expected to input a 
        single character as an operator (+, -, *, or /). */

        int ans=0;

        if(op =='+'){
            ans=n1+n2;
            System.out.println("no1 + no2 = "+ans);
        }
        else if(op == '-') {
            ans=n1-n2;
            System.out.println("no1 - no2 = "+ans);
        }
        else if(op=='*') {
            ans=n1*n2;
            System.out.println("no1 * no2 = "+ans);
        }
        else if(op=='/'){
            ans=n1/n2;
            System.out.println("no1 / no2 = "+ans);
        }
        else{
            System.out.println("wrong input");
        }
    }
}