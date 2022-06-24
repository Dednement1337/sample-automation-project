package MathTasks;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MathTestCheckerForTask1 extends Solution {

    @Test
    public void checkTestDisriminantMoreThenZero() {
        Assert.assertTrue(discriminantMoreThenZero(),"Discriminant less or equals zero");
    }

    @Test
    public void checkTestDisriminantEqualsZero() {
        Assert.assertTrue(discriminantEqualsZero(),"Discriminant more or less then zero");
    }

    @Test
    public void checkTestDisriminantLessThenZero() {
        Assert.assertTrue(discriminantLessThenZero(),"Discriminant more or equals zero");
    }
}
