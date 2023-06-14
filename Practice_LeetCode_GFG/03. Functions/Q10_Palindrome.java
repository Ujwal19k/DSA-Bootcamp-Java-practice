import java.util.Scanner;

//Write a function to find if a number is a palindrome or not. Take number as parameter.
public class Q10_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        isPalin(n);
    }

    private static void isPalin(int n) {
        int len=(int) (Math.log10(n)+1);
        int digit =0, sum=0;
        int num=n;
        for(int i=1;i<=len;i++){
            digit=num%10;
            sum=sum*10+digit;
            num /=10;
        }
        System.out.println("The reversed number is: "+sum);
        if(sum==n){
            System.out.println("The number is Palindrome");
        }
        else{
            System.out.println("The number is not palindrome");
        }
    }
}
