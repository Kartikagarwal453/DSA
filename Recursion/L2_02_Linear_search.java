// To find an element in an array .
// find() -> to find if an element exist in an array or not .
// findindex() -> to find the index of an element in an array .

public class L2_02_Linear_search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,65,34,95,43,22,93};
        int target = 65;
        System.out.println(find(arr,target,0));
        System.out.println(findindex(arr,target,0));
    }
    static boolean find(int[] arr , int target , int index){
        if(index== arr.length){
            return false;
        }
        return arr[index] == target || find(arr, target, index+1);
    }
    static int findindex(int[] arr , int target , int index){
        if(index== arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else {
            return findindex(arr, target, index+1);
        }
    }
}
