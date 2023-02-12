import java.util.Scanner;

//Take name as input and print a greeting message for that particular name.
public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine(); // input entire line
        //String name = sc.next(); will take i/p word before space
        System.out.println("Hello "+name+" how are you ?");
    }
}
