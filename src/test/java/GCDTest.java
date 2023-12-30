import org.junit.Assert;
import org.junit.Test;

public class GCDTest {
    @Test
    public void gCDTest1(){
        long expected = 34;
        long p = 102;
        long q = 68;
        long actual = GCDClass.gCD(p, q);
        Assert.assertEquals(expected, actual);

    }
}
