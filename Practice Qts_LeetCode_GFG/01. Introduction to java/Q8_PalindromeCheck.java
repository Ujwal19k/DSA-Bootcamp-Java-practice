import java.util.Scanner;

//To find out whether the given String is Palindrome or not.
public class Q8_PalindromeCheck {
    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner sc=new Scanner(System.in);
        String word = sc.nextLine();

        int lword = word.length(); //to store length

        String rev="";
        for(int i=lword-1;i>=0;i--){ //for loop from last 
            rev=rev+word.charAt(i);
        }

        if(word.equals(rev)){
            System.out.println("The string is a palindrome");
        }
        else{
            System.out.println("The string is not a palindrome");
        }

    }
}
