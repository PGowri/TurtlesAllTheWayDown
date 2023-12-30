public class FactorialClass {

    public static long factorial(long n){
        // edge case
        if(n < 0){
            return -1;
        }
        if(n==0 || n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }
}
