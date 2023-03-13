//Define a method to find out if a number is prime or not.
public class Q07_Prime {
    public static void main(String[] args) {
        int num= 8;
        if(isPrime(num)){
            System.out.println("The number is Prime");
        }
        else{
            System.out.println("The number is not prime");
        }
    }

    private static boolean isPrime(int num) {
            if(num<=1){
                return false;
            }

            for(int i=2;i<Math.sqrt(num);i++){
                if(num%i==0){
                    return false;
                }
            }
        return true;
    }
    
}
