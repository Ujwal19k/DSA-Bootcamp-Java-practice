//1295. Find Numbers with Even Number of Digits
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenNumbers {
    public static void main(String[] args) {
        int[] nums={20,44,444,567,2,11};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers( int[] nums) {
        int count =0;
        for (int num : nums) {
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    
    static boolean even(int num){
        int digits=(int) (Math.log10(num)+1);
        return digits%2==0;

    }
}

