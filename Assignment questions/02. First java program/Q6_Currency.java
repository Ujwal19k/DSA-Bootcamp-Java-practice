import java.util.Scanner;

//Q6. Input currency in rupees and output in USD.
//1 rupee = 0.012 USD (12/02/2023)
public class Q6_Currency {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the ammount in rupees: ");
    float r=sc.nextFloat();
    float usd = r*0.012f;
    /*The value of r is a float, but the constant 0.012 is a double.
     When you perform a multiplication operation with a float and a double, 
     the result is automatically promoted to a double. However, you are trying 
     sto assign the result to a float variable, which may result in a loss of precision. */

    System.out.println("The ammount in USD is: "+usd);
    }
    
}
