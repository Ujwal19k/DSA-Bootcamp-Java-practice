import java.util.Scanner;

public class Q20_LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:  ");
        int num1=sc.nextInt();
        System.out.println("Enter second number:  ");
        int num2=sc.nextInt();
        int lcm=(num1>num2)?num1:num2;
        
        while(true){
        if(lcm%num1==0 && lcm%num2==0){
            System.out.printf("The LCM of %d and %d is %d.", num1, num2, lcm);
            break;
        }
        lcm++;
    }
        
       

    }
}
