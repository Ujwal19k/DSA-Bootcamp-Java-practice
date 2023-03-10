import java.util.Scanner;

//Find if a number is palindrome or not
public class Q17_Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=sc.nextInt();
        numP(num);
        System.out.print("\nEnter string: ");
        String str=sc.next();
        strP(str);
    }

    private static void strP(String str) {
        String srev="";
        for(int i=0;i<str.length();i++){
            srev=str.charAt(i)+srev;  //this order is imp. if it was srev=srev+str.charAt(i) then it would not have been reversed
        }
        System.out.println("\nThe reverse of the string is: "+srev);
        if(srev.equals(str)){
            System.out.println("The String entered is a Palindrome");
        }
        else{
            System.out.println("The String entered is not a Palindrome");
        }
        

    }

    private static void numP(int num) {
        int len=(int) (Math.log10(num)+1);
        System.out.println("\nThe length of the number is: "+len);
        int rev=0;
        while(num>0){
            // int rem=num%10;
            // rev=(int) (Math.pow(10, (len-1))*rem) + rev;
            // System.out.println(rev);
            // num /=10;
            // System.out.println(num);
            int rem =num%10;
            rev=rem+(rev*10);
            num = num/10;
        }
        System.out.println("The reverse is: "+rev);
        if(rev==num){
            System.out.println("The number entered is a Palindrome");
        }
        else{
            System.out.println("The number entered is not a Palindrome");
        }
    }
}
