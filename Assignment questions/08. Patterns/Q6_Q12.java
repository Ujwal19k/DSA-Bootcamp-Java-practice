public class Q6_Q12 {
    public static void main(String[] args) {
        //pattern6(5);
        pattern7(5);
    }

    private static void pattern7(int n) {
    //    *****
    //     ****
    //      ***
    //       **
    //        *
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(j>=n-i+1){       //5-1+1=5....5-2+1=4 .....5-5+1=1
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }System.out.println();
    }

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
