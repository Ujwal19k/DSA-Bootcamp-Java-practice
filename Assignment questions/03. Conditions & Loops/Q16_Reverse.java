import java.util.Scanner;
//Reverse A String In Java

public class Q16_Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String word =sc.next();
        String reverse = "";
        
        for(int i=0;i<word.length();i++){
            reverse=word.charAt(i)+reverse;
        }
        System.out.println(reverse);
    }
}
