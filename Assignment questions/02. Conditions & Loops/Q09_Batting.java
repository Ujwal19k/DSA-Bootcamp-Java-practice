import java.util.Scanner;

//Calculate Batting Average
//batting avg = total no of runs score/total number of times they have been out
public class Q09_Batting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of runs scored: ");
        int runs = sc.nextInt();
        System.out.print("Enter total number of times they have been out: ");
        int out = sc.nextInt();

        float avg= (float) (runs/out);
        System.out.println("The average is: "+avg);
    }
}
