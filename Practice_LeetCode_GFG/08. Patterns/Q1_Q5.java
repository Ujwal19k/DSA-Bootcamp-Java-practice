public class Q1_Q5 {
    public static void main(String[] args) {
        //patter1(5);
        //patter2(5);
        //patter3(5);
        //patter4(5);
        pattern5(5);
    }

    private static void pattern5(int n) {
    // *
    // **
    // ***
    // ****
    // *****
    // ****
    // ***
    // **
    // *

    for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }System.out.println();
    }
    for(int i=1;i<n-1;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print("*");
        }
        System.out.println();
    }

    }

    private static void patter4(int n) {
    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5
    for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
    }
    }

    private static void patter3(int n) {
    // *****
    // ****
    // ***
    // **
    // *
    for(int i=1;i<=5;i++){
        for(int j=1;j<=6-i;j++){
            System.out.print("* ");
        }System.out.println();
    }
    }

    private static void patter2(int n) {
        // *
        // **
        // ***
        // ****
        // *****
        for(int i=1;i<=n;i++){
            for(int j=1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void patter1(int n) {
        // *****
        // *****
        // *****
        // *****
        // *****
        for (int i = 1; i <=5; i++) {
            for(int j=1;j<=5;j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
