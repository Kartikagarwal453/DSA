// Product of the digits of a number .

public class L1_04_ProductOfDigits {
    public static void main(String[] args) {
        System.out.println(prod(235));
    }
    static int prod(int n){
        if(n%10==n){
            return n;
        }
        return (n%10) * prod(n/10);
    }
}
