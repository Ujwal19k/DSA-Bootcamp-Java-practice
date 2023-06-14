//1832. Check if the Sentence Is Pangram
//https://leetcode.com/problems/check-if-the-sentence-is-pangram/
//YT: https://www.youtube.com/watch?v=yd9IHmKPdE4&t=989s


class Q10_Pangram{
    public static void main(String[] args) {
        boolean ans = checkPangram("thequickbrownfoxjumpsoverthelazydog"); //true
        //boolean ans = checkPangram("thequickbrownxjumpsoverthelazydog");    //false
        System.out.println(ans);

        
        
    }

    public static boolean checkPangram(String sentence){
        boolean[] arr=new boolean[26];
        //this will store the record of the letters present in the sentence
        // true if the letter present and false if not
        //ASCII: a-97 and z-122
        for(int i=0; i<sentence.length();i++){     
            arr[sentence.charAt(i)-97]=true;
        } 
        for(int i=0; i<26;i++){     //this will traverse through the array arr
            if(arr[i]==false){
                return false;
            }
        }
        
        return true;

    }
}



/*class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] arr=new boolean[26]; //this will store the record of the letters present in the sentence
        // true if the letter present and false if not
        //ASCII: a-97 and z-122

        for(int i=0; i<sentence.length();i++){
            arr[sentence.charAt(i)-97]=true;
        } 
        for(int i=0;i<26;i++){
            if(arr[i]==false){
                return false;
            }
        }
        return true;
    }
} */