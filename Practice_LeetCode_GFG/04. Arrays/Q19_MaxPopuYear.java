//1854. Maximum Population Year
// https://leetcode.com/problems/maximum-population-year/description/

public class Q19_MaxPopuYear {
    public static void main(String[] args) {
        int[][] logs = { { 1993, 1999 }, { 2000, 2010 } };
        int max = maximumPopulation(logs);
        System.out.println(max);
    }

    private static int maximumPopulation(int[][] logs) {
        int[] arr = new int[101]; // 101 because 1950 <= birthi < deathi <= 2050
        for (int i = 0; i < logs.length; i++) {
            for (int j = logs[i][0]; j < logs[i][1]; j++) {
                arr[j - 1950]++;
            }
        }
        int maxVal = 0;
        int maxYear = 1950;
        for (int i = 0; i < 101; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
                maxYear = i + 1950;
            }
        }
        return maxYear;

    }
}
