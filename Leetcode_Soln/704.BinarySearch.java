// 704. Binary Search
// https://leetcode.com/problems/binary-search/description/

class Solution {
    public int search(int[] nums, int target) {
        return helper(nums,target,0,nums.length-1);
    }
    static int helper(int[] arr,int target,int s,int e){
        if(s>e){
            return -1 ;
        }
        int m = s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        else if(arr[m]>target){
            return helper(arr,target,s,m-1);
        }
        else{
            return helper(arr,target,m+1,e);
        }
    }
}
