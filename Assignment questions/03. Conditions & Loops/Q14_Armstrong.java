import java.util.Scanner;

//Armstrong Number In Java
//armstrong numbers = 1634, 371
public class Q14_Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int sum=0;
        int len = (int) (Math.log10(num) + 1);

        while(true){
            int digit =num%10;
            sum+=Math.pow(digit, len);
            num/=10;
            if(num==0){
                break;
            }
        }
        System.out.println("The number obtained is: "+sum);
        if(sum==num){
            System.out.println("The number entered is Armstrong number");
        }
        else{
            System.out.println("The number entered is not Armstrong number");
        }
    }
}
