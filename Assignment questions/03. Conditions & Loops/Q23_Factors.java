import java.util.Scanner;

//Input a number and print all the factors of that number (use loops).
public class Q23_Factors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=sc.nextInt();
        System.out.print("The factors are: ");
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.print(i+", ");
            }
        }
        
    }
}
