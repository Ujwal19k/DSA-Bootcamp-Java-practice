// Number of occurrence
// https://takeuforward.org/data-structure/count-occurrences-in-sorted-array/
class Solution {
    int count(int[] arr, int n, int x) {
        // LINEAR SEARCH -Total Time 0.66 - Time Complexity: O(N)
        int ct = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                ct++;
            }
        }
        return ct;

        // //time taken - 0.81; accuracy - 50%
        // HashMap<Integer,Integer> map =new HashMap<>();

        // for(int i=0;i<n;i++){
        // // checking if the element is present or not, if not present then giving it a
        // // default value
        // int value=map.getOrDefault(arr[i],0);
        // map.put(arr[i],value+1);
        // }

        // if(map.get(x)!=null){
        // return map.get(x);
        // }else{
        // return 0;
        // }

    }
}