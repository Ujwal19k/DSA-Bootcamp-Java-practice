import java.util.Scanner;

//Calculate Average Of N Numbers
public class Q03_Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        float sum=0;
        

        while(true){
            System.out.print("Enter the number (press 0 for output): ");
            float num = sc.nextFloat();
            if(num==0){
                break;
            }
            count++;
            sum+=num;
        }
        float avg=(sum/count);
        System.out.println("The Sum is: "+sum);
        System.out.println("Total numbers are: "+count);
        System.out.print("The average is: "+avg);
        
    }
}
