import java.util.Scanner;
//HCF Of Two Numbers Program
//eg.
// 12 → 1, 2, 3, 4, 6, 12
// 16 → 1, 2, 4, 8, 16
// The common factors are 1, 2, 4 and the highest common factor is 4.
public class Q19_HCF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:  ");
        int num1=sc.nextInt();
        System.out.println("Enter second number:  ");
        int num2=sc.nextInt();
        int hcf=0;
        for(int i=1;(i<=num1|| i<=num2); i++){
            if(num1%i==0 && num2%i==0){
                hcf=i;                      //here the loop will go on untill i<=num1|| i<=num2. therefor the hcf will keep on updating till it gets the highest 
            }
        }
        System.out.println("The HCF of "+num1+" & "+num2+" is "+hcf);

    }
}
