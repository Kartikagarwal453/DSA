// Sum of the digits of a number .

public class L1_03_SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(235));
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return (n%10) + sum(n/10);
    }
}
