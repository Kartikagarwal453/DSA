public class Linear_search {
    public static void main(String[] args) {
        System.out.println("LINEAR SEARCH");
        int[] nums = {23,45,69,87,85,55,94,59,81,11};
         int ans = l_search(nums,1);
        System.out.println(ans);

    }
    static int l_search(int[] arr,int x){
        if (arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(x==arr[i]){
                return i;
            }
        }
        return -1;
    }
    static void l_search2(int[] arr,int x){
      if (arr.length==0){
          System.out.println("Array is empty.");
      }
      for (int i = 0; i < arr.length; i++) {
          if (x == arr[i]) {
              System.out.println("Element is present at index " + i);
              break;
          }
          else if (i==arr.length-1){
              System.out.println("Element not present.");
      }

      }
    }
}
