import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the largest number from all.
public class Q25_Largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int largest=0;
        int sum=0;
        
        while(true){
            System.out.print("Enter integer: ");
            int num=sc.nextInt();
            if(num==0){
                break;
            }
            if(num>largest){
                largest=num;
            }
        }
        System.out.println("The largest number is: "+largest);
    }
}
