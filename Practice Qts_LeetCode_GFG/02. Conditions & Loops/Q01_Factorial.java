import java.util.Scanner;

//Factorial Program In Java
public class Q01_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int fact = 1;
        for (int i = num; i > 0; i--) {
            fact *= i;
        }
        System.out.println("The factorial is: " + fact);
    }
}
