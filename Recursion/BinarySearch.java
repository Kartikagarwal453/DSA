public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,9,11,54,69,72,85,99};
        int target = 9;
        int ans = search(arr,target,0,arr.length-1);
        System.out.println(ans);
    }
    static int search(int[] arr,int target,int s,int e){
        if(s>e){
            return -1 ;
        }
        int m = s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        else if(arr[m]>target){
            return search(arr,target,s,m-1);
        }
        else{
            return search(arr,target,m+1,e);
        }
    }
}
