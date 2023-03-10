import java.util.Scanner;

//Write a program to print whether a number is even or odd, also take input from the user.
public class Even{
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int no = n.nextInt(10);
        if(no%2==0){
            System.out.println(no + " is even");
        }
        else{
            System.out.println(no + " is odd");
        }
    }
}