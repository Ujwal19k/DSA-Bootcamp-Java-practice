import java.util.Scanner;

//Calculate CGPA Java Program
public class Q10_CGPA {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Grade points (0-9) of Subject 1: ");
        int s1=sc.nextInt();
        System.out.print("Enter Grade points (0-9) of Subject 2: ");
        int s2=sc.nextInt();
        System.out.print("Enter Grade points (0-9) of Subject 3: ");
        int s3=sc.nextInt();
        System.out.print("Enter Grade points (0-9) of Subject 4: ");
        int s4=sc.nextInt();
        System.out.print("Enter Grade points (0-9) of Subject 5: ");
        int s5=sc.nextInt();

        System.out.println("The CGPA is: "+(s1+s2+s3+s4+s5)/5);

    }
}
