import java.util.ArrayList;

//1732. Find the Highest Altitude
//https://leetcode.com/problems/find-the-highest-altitude/

public class Q12_HighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }

    private static ArrayList<Integer> largestAltitude(int[] gain) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);
        int sec = gain[0];
        list.add(sec);
        int nett = 0;
        for (int i = 1; i < gain.length; i++) {
            nett = gain[i] + list.get(i);
            list.add(nett);
            nett = 0;
        }

        int maximum = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (maximum < list.get(i))
                maximum = list.get(i);
        }

        return list; 


        // int res=0;
        // int alt=0;
        // for(int num:gain){
        //         alt+=num;
        //         res=Math.max(alt,res);
        // }
        // return res;
    }
}
