import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    Maximum max;

    //TC 1.1
    @Test
    public void givenIntegers_WhenMaxAtPositionOne_ShouldReturnMaximum() {
        max = new Maximum();
        Integer maximum = Maximum.getMaximumInteger(19,17,15);
        Assert.assertEquals(19,(int)maximum);
    }

    //TC 1.2
    @Test
    public void givenIntegers_WhenMaxAtPositionTwo_ShouldReturnMaximum() {
        max = new Maximum();
        Integer maximum = Maximum.getMaximumInteger(17, 19, 15);
        Assert.assertEquals(19, (int) maximum);
    }

    //TC 1.3
    @Test
    public void givenIntegers_WhenMaxAtPositionThree_ShouldReturnMaximum() {
        max = new Maximum();
        Integer maximum = Maximum.getMaximumInteger(15, 17, 19);
        Assert.assertEquals(19, (int) maximum);
    }

}
