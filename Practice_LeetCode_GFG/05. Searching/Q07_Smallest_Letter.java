//744. Find Smallest Letter Greater Than Target
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class Q07_Smallest_Letter {
    public static void main(String[] args) {
        char[] letters={'c','f','j'};
        char target = 'f';
        char ans=nextGreatestLetter(letters,target);
        System.out.println(ans);

    }

    static char nextGreatestLetter(char[] letters, char target) {
        int st=0;
        int end=letters.length-1;

        while(st<=end){
            int mid=st+(end-st)/2;
            if(target<letters[mid]){
                end=mid-1;
            }
            else{
                st=mid+1;   //because the condition is Return the smallest character in letters that is lexicographically greater than target
            }
        }
        return letters[st%letters.length];  //index 3%4=3 but index 4%4=0
    }
}
