// https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/second-largest3735

class Solution {
    public int getSecondLargest(int[] arr) {
        int n=arr.length;
        int l = -1;
        int sl = -1;
        for(int i = 0;i<n;i++){
            if(arr[i]>l){
                sl = l;
                l = arr[i];
            }
            else if(arr[i] < l && arr[i] > sl){
                sl = arr[i];
            }
        }
        return sl;
    }
}