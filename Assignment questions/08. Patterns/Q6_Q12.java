public class Q6_Q12 {
    public static void main(String[] args) {
        pattern6(5);
    }

    private static void pattern6(int n) {
    //      *
    //     **
    //    ***
    //   ****
    //  *****
    for(int i=1; i<=n;i++){
        for(int j=1;j<=5;j++){
            if(j<=5-i){
                System.out.print(" ");
            }else{
                System.out.print("*");
            }
        }System.out.println();
        
    }
    }
}
