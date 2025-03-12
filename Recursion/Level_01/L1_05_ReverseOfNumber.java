// Reverse of a number . 
// To solve this problem i have used two methods .

public class L1_05_ReverseOfNumber {
    static int sum = 0;
  // Method - 1
    static void rev1(int n){
        if (n==0){
            System.out.println(sum);
            return;
        }
        int r = n%10;
        sum = (sum*10) + r ;
        rev1(n/10);
    }
  // Method - 2
    static int rev2(int n){
        // Sometimes we might need some additional variables in the argument.
        // In that case we can make use of another function(helper function).
        int digits = (int)(Math.log10(n)) +1 ;
        return helper(n,digits);
    }
  // Helper function for method - 2 .
    static int helper(int n , int digits){
        if (n%10==n){
            return n;
        }
        int rem = n%10;
        return (rem * (int)Math.pow(10,digits-1)) + helper(n/10,digits-1);
    }
  // Main function 
    public static void main(String[] args) {
        System.out.println(rev2(1234));
    }

}
