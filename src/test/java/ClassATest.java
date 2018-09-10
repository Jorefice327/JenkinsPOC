import org.junit.Assert;
import org.junit.Test;

public class ClassATest {

    @Test
    public void testHelloWorld() {
        String result = ClassA.helloWorld();
        Assert.assertEquals(result, "Hello World");
    }

    @Test
    public void testAdd() {
        Assert.assertEquals(10, ClassA.add(8, 2));
        Assert.assertEquals(5, ClassA.add(3, 2));
        Assert.assertEquals(8, ClassA.add(3, 5));
        Assert.assertEquals(1253, ClassA.add(100, 23));
    }
}