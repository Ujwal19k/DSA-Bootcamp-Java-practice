//Subtract the Product and Sum of Digits of an Integer
//Leetcode: 1281. Subtract the Product and Sum of Digits of an Integer 
//Link: https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
import java.util.Scanner;

public class Q22_Operation_L {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int sum=0, prod=1;

        while(num!=0){
            int singleDigit = num%10;
            sum +=singleDigit;
            prod*=singleDigit;
            num/=10;
        }
        System.out.println("The sum is: "+sum);
        System.out.println("The product is: "+prod);
        int ans = prod-sum;
        System.out.println("The answer is: "+prod+"-"+sum+"="+ans);
    }
}
