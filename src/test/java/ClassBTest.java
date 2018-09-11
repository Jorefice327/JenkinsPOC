package test.java;

import org.junit.Assert;
import org.junit.Test;
import main.java.*;

public class ClassBTest {

    @Test
    public void testAddAndMultiply() {
        Assert.assertEquals(50, ClassB.addAndMultiply(2, 3, 10));
        Assert.assertEquals(66, ClassB.addAndMultiply(2, 4, 11));
    }

    @Test
    public void testAddAndDivide()
    {
        Assert.assertEquals(35, ClassB.addAndDivide(20, 50, 2), 0.01);
        Assert.assertEquals(3.5, ClassB.addAndDivide(20, 50, 20), 0.1);
    }
}