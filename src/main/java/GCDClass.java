public class GCDClass {

    public static long gCD(long p, long q) {
        if (p < 0 || q < 0){
            return -1;
        }
        if( q == 0){
            return p;
        }
        if( p >= q){
            return gCD(q, p % q); //If p > q, the gcd of p and q is the same as the gcd of q and p % q
        } else {
            return gCD(q, p);
        }
    }

    public static long gCD1(long p , long q) {
        while (q != 0){
            long temp = q ;
            q = p % q ;
            p = temp ;
        }
        return p ;
    }
}
