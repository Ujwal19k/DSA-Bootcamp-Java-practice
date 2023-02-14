import java.util.Scanner;

//To find Armstrong Number between two given number.
public class Q9_Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num=sc.nextInt();

        int lnum = sc.nextInt(num);
        double sum=0;
        while(lnum>0){
            int lastnum = num%10;
            double eachnum = Math.pow(lastnum, lnum);

            sum = sum + eachnum;
            lastnum=lastnum/10;        
            lnum--;
        }
        System.out.println("ans"+sum);
    }
}
