public class Q6_Q12 {
    public static void main(String[] args) {
        //pattern6(5);
        //pattern7(5);
        pattern8(5);
    }

    private static void pattern8(int n) {
    //     *
    //    ***
    //   *****
    //  *******         //i=4 j=7   j<2n-1
    // *********
    for(int i=1; i<=n;i++){
        for(int k=1;k<=n-i;k++){
            System.out.print(" "); //1st row=4 space 
                                     //2nd row= 3 space
        }
        for(int j=1;j<=(2*i-1);j++){
            System.out.print("*"); //1st row= 1 *      //2nd row= 3(2*2-1) *
        }
        System.out.println();
    }
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
