import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
public class Q24_Sum_Loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        
        while(true){
            System.out.print("Enter integer: ");
            int num=sc.nextInt();
            if(num==0){
                break;
            }
            sum+=num;
        }
        System.out.println("The sum is: "+sum);
    }
}
