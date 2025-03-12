// To find an element in an array .
// find() -> find if the target element exist in an array or not .
// findindexFirst() -> find the first index of the target element in an array .
// findindexLast() -> find the last index of the target element in an array .
// findAllIndex() -> gives all the index at whichh the target element is present .
// findAllIndex2() -> gives all the index at whichh the target element is present in the form of ArrayList .
// findAllIndex3() -> gives all the index at whichh the target element is present in the form of ArrayList , but don't take it in the argument of the function .

import java.util.ArrayList;

public class L2_02_Linear_search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,65,3,34,3,95,3,43,22,93};
        int target = 3;
        System.out.println(find(arr,target,0));
        System.out.println(findindexFirst(arr,target,0));
        System.out.println(findindexLast(arr,target, arr.length-1));
        /*
        findAllIndex(arr,target,0);
        System.out.println(list);
        */
        System.out.println(findAllIndex2(arr,target,0 , new ArrayList<>()));
        System.out.println(findAllIndex3(arr,target,0));
    }
    
    static boolean find(int[] arr , int target , int index){
        if(index== arr.length){
            return false;
        }
        return arr[index] == target || find(arr, target, index+1);
    }
    
    static int findindexFirst(int[] arr , int target , int index){
        if(index== arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else {
            return findindexFirst(arr, target, index+1);
        }
    }
    
    static int findindexLast(int[] arr , int target , int index){
        if(index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else {
            return findindexLast(arr, target, index-1);
        }
    }
    
    /*
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr , int target , int index){
        if(index== arr.length){
            return ;
        }
        if(arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr, target, index+1);
    }
    */
    
    static ArrayList findAllIndex2(int[] arr , int target , int index,ArrayList<Integer> list){
        if(index== arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndex2(arr, target, index+1,list);
    }

    static ArrayList findAllIndex3(int[] arr , int target , int index){

        ArrayList<Integer> list = new ArrayList<>();

        if(index== arr.length){
            return list;
        }
        // This will contain answer for that function call only .
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> AnsFromBelowCalls = findAllIndex3(arr, target, index+1);
        list.addAll(AnsFromBelowCalls);
        return list;
    }
}
