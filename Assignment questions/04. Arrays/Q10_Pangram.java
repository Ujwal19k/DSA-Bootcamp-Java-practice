//1832. Check if the Sentence Is Pangram
//https://leetcode.com/problems/check-if-the-sentence-is-pangram/


//this is wrong solution 
//we'll have to use S
public class Q10_Pangram {
    public static void main(String[] args) {
        String str="ujwal";
        int count=0;
        for(int i=0;i<str.length();i++){
            int num=str.charAt(i);
            if(!(num>=97 && num<=122)){
                count++;
            }
        }
        if(count==0){
            System.out.println("The string is Pangram");
        }else{
            System.out.println("The string is not Pangram");
        }
        
    }
    
}
