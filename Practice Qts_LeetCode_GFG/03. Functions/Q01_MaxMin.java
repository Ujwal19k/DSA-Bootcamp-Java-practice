//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user
public class Q01_MaxMin {
    public static void main(String[] args) {
        int n1=24, n2=21, n3=68;
        System.out.println("The max value is: "+max(n1,n2,n3));
        System.out.println("The min value is: "+min(n1,n2,n3));

        
    }

    private static int max(int n1, int n2, int n3) {
        int max=Math.max(n1, Math.max(n2,n3));
        return max;
        
    }

    private static int min(int n1, int n2, int n3) {
        int min=Math.min(n1, Math.min(n2,n3));
        return min;
    }
}
