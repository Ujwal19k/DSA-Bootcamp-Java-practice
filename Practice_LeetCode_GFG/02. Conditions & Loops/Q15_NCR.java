import java.util.Scanner;

//Find Ncr & Npr

public class Q15_NCR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ch=0;
        while(true){
            System.out.println("\nEnter 1 to find Permutation (nPr)\nEnter 2 to find Combination (nCr)\nEnter 0 to exit");
            ch=sc.nextInt();
            if(ch==1){
                System.out.println("Enter n: ");
                int nP = sc.nextInt();
                System.out.println("Enter r: ");
                int rP = sc.nextInt();
                int ansP = factorial(nP)/factorial(nP-rP);
                System.out.println("The Permutation is: "+ansP);
            }
            else if(ch==2){
                System.out.println("Enter n: ");
                int nC = sc.nextInt();
                System.out.println("Enter r: ");
                int rC = sc.nextInt();
                int ansC = factorial(nC)/(factorial(nC-rC)*factorial(rC));
                System.out.println("The Combination is: "+ansC);
            }
            else if(ch==0){
                break;
            }
        }
    }
    static int factorial(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }
}
