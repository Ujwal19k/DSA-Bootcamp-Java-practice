//Define a program to find out whether a given number is even or odd
public class Q02_EvenOdd {
    public static void main(String[] args) {
        int n1=20, n2=71;
        if(isEvenOdd(n1)){
            System.out.println("The number "+n1+" is Prime");
        }else{
            System.out.println("The number "+n1+" is not Prime");
        }
        
    }

    private static boolean isEvenOdd(int n1) {
        return n1 % 2==0;
    }
}
