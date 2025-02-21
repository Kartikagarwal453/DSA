// Find if the given number is palindrome 

public class L1_06_Palindrome {
    static int rev(int n){
        // Sometimes we might need some additional variables in the argument.
        // In that case we can make use of another function(helper function).
        int digits = (int)(Math.log10(n)) +1 ;
        return helper(n,digits);
    }
    static int helper(int n , int digits){
        if (n%10==n){
            return n;
        }
        int rem = n%10;
        return (rem * (int)Math.pow(10,digits-1)) + helper(n/10,digits-1);
    }
    static boolean palindrome(int n){
        return (n==rev(n));
    }

    public static void main(String[] args) {
        System.out.println(palindrome(1234321));
    }
}
