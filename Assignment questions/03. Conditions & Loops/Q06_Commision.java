import java.util.Scanner;

//Calculate Commission Percentage
public class Q06_Commision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the final price: ");
        double finalp = sc.nextDouble();
        System.out.print("Enter the Commision ammount included in the final price: ");
        double commp = sc.nextDouble();

        double percent = (100*(commp/finalp));
        System.out.println("The Commision in "+finalp+" is "+percent+"%");
    }
    
}
