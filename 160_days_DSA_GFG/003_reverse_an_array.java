// https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/reverse-an-array

class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int l = 0;
        int r = arr.length -1;
        while(l<=r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}