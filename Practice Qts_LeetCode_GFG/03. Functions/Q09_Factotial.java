import java.util.Scanner;

//Write a program to print the factorial of a number by defining a method named 'Factorial'
public class Q09_Factotial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n=sc.nextInt();
        Factorial(n);
        
    }

    private static void Factorial(int n) {
        
        int fact=1;
        if(n==1 || n==0){
            System.out.println("The Factorial is 1");
        }else{
            for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("The Factorial is: "+fact);
        }
        
    }
    
}
