import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void factorialTest(){
        long expected = 1;
        long n = 1;
        long actual = FactorialClass.factorial(n);
        Assert.assertEquals(expected, actual);
    }

}
