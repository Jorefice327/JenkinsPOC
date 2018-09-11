import org.junit.Assert;
import org.junit.Test;

public class ClassATest {

    @Test
    public void testHelloWorld() {
        Assert.assertEquals(ClassA.helloWorld(), "Hello World");
    }

    @Test
    public void testAdd() {
        Assert.assertEquals(10, ClassA.add(8, 2));
        Assert.assertEquals(5, ClassA.add(3, 2));
        Assert.assertEquals(8, ClassA.add(3, 5));
        Assert.assertEquals(123, ClassA.add(100, 23));
    }

    @Test
    public void testSubtract()
    {
        Assert.assertEquals(10, ClassA.subtract(15, 5));
        Assert.assertEquals(100, ClassA.subtract(1000, 900));
    }
}