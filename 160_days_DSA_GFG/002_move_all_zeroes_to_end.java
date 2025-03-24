// https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/move-all-zeroes-to-end-of-array0751

class Solution {
    void pushZerosToEnd(int[] arr) {
        int c = 0;
        int n = arr.length;
        for (int i=0;i<n;i++){
            if(arr[i] != 0){
                int t = arr[i];
                arr[i] = arr[c];
                arr[c] = t;
                c++;
            }
        }
    }
}