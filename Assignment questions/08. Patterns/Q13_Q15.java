public class Q13_Q15 {
    public static void main(String[] args) {
        //pattern13(5);
        //pattern14(5);
        pattern15(5);
    }

    private static void pattern15(int n) {
    //      *
    //     * *
    //    *   *
    //   *     *
    //  *       *
    //   *     *
    //    *   *
    //     * *
    //      *
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){          //for external space
                System.out.print(" ");
            
        }
        
        for(int k=1;k<=(i*2)-1;k++){       // for *
                                         // for internal space
                if(k==1 || k==(i*2)-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            

        }
        for(int i=2;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(n-i+1)*2-1;k++){
                if(i==1){
                    System.out.print("*");
                }else{
                    if(k==1 || k==(n-i+1)*2-1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }


    private static void pattern14(int n) {
    //    *********         i=1 sp=0 isp=0
    //     *     *          i=2 sp=1 isp=5
    //      *   *           i=3 sp=2 isp=3
    //       * *            i=4 sp=3 isp=1
    //        *             i=3 sp=3 isp=0
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i-1;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=(n-i+1)*2-1;k++){
            if(i==1){
                System.out.print("*");
            }else{
                if(k==1 || k==(n-i+1)*2-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
    }
    }

    private static void pattern13(int n) {
    //      *               i=1 j=1        sp=4 internalsp=0    position
    //     * *              i=2 j=2        sp=3 internalsp=1      5 
    //    *   *             i=3 j=2        sp=2 internalsp=3     456
    //   *     *            i=4 j=2        sp=1 internalsp=5     3456
    //  *********           i=5 j=9        sp=0 internalsp=0
    //  123456789
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){          //for external space
                    System.out.print(" ");
                
            }
            
            for(int k=1;k<=(i*2)-1;k++){       // for *
                if(i==5){                          //for the last row
                    System.out.print("*");  
                }else{                              // for internal space
                    if(k==1 || k==(i*2)-1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }

            }
            System.out.println();
        }
    }
    
}
