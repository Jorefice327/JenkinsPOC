import org.junit.Assert;
import org.junit.Test;

public class ClassBTest {

    @Test
    public void testAddAndMultiply() {
        Assert.assertEquals(50, ClassB.addAndMultiply(2, 3, 10));
        Assert.assertEquals(66, ClassB.addAndMultiply(2, 4, 11));
    }
}