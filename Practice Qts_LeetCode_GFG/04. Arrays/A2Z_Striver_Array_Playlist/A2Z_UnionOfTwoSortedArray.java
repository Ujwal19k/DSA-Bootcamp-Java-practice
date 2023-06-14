// Union of Two Sorted Arrays
// https://practice.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1

//User function Template for Java

//arr1,arr2 : the arrays
// n, m: size of arrays
class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        // int n=arr1.length;
        // int m=arr2.length;
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
        }
        for (int i = 0; i < m; i++) {
            map.put(arr2[i], map.getOrDefault(arr2[i], 0) + 1);
        }

        for (int it : map.keySet()) {
            arr.add(it);
        }

        // for(Map.Entry<Integer,Integer> e:map.entrySet()){
        // arr.add(e.getKey());
        // }
        Collections.sort(arr);
        return arr;
    }
}