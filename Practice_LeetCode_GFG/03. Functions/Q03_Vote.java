import java.util.Scanner;

//A person is eligible to vote if his/her age is greater than or equal to 18. 
//Define a method to find out if he/she is eligible to vote
public class Q03_Vote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age =sc.nextInt();
        if(findAge(age)){
            System.out.println("The person is eligible to vote");
        }
        else{
            System.out.println("The person is not eligible to vote");
        }
        
    }

    private static boolean findAge(int age) {
        return age>=18;
    }
    
}
