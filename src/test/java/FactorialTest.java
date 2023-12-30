import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void factorialTest1(){
        long expected = 1;
        long n = 1;
        long actual = FactorialClass.factorial(n);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void factorialTest2(){
        long expected = 4*3*2*1;
        long n = 4;
        long actual = FactorialClass.factorial(n);
        Assert.assertEquals(expected, actual);
    }
}
