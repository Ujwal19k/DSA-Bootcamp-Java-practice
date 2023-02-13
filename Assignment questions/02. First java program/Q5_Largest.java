import java.util.Scanner;

//Take 2 numbers as input and print the largest number.
public class Q5_Largest {
    public static void main(String[] args) {
      System.out.println("Enter 2 numbers: ");  
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt(10);
      int n2=sc.nextInt(10);
      /*A radix is the base of the number system that is used to represent a number. 
      In Java, the radix is specified as an argument when converting a string to an integer.
      The error message says that the radix argument is 0, which is an illegal argument. 
      The radix must be between 2 and 36, inclusive. If you want to parse an integer in 
      decimal format, the radix should be set to 10. */
      
      if(n1>n2){
        System.out.println(n1+" is greater than "+n2);
      }
      else{
        System.out.println(n1+" is less than "+n2);
      }
    }
}
