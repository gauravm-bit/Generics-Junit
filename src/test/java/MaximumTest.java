import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    Maximum max;

    //TC 1.1
    @Test
    public void givenIntegers_WhenMaxAtPositionOne_ShouldReturnMaximum() {
        Integer maximum = Maximum.getMaximumInteger(19,17,15);
        Assert.assertEquals((Integer)19,maximum);
    }

    //TC 1.2
    @Test
    public void givenIntegers_WhenMaxAtPositionTwo_ShouldReturnMaximum() {
        Integer maximum = Maximum.getMaximumInteger(17, 19, 15);
        Assert.assertEquals((Integer)19,maximum);
    }

    //TC 1.3
    @Test
    public void givenIntegers_WhenMaxAtPositionThree_ShouldReturnMaximum() {
        Integer maximum = Maximum.getMaximumInteger(15, 17, 19);
        Assert.assertEquals((Integer)19,maximum);
    }

    //TC 2.1
    @Test
    public void givenFloats_WhenMaxAtPositionOne_ShouldReturnMaximum() {
        Float maximum = Maximum.getMaximumFloat(12.1f,11.1f,10.1f);
        Assert.assertEquals((Float)12.1f,maximum);
    }

    //TC 2.2
    @Test
    public void givenFloats_WhenMaxAtPositionTwo_ShouldReturnMaximum() {
        Float maximum = Maximum.getMaximumFloat(11.1f,12.1f,10.1f);
        Assert.assertEquals((Float)12.1f,maximum);
    }

    //TC 2.3
    @Test
    public void givenFloats_WhenMaxAtPositionThree_ShouldReturnMaximum() {
        Float maximum = Maximum.getMaximumFloat(11.1f,10.1f,12.1f);
        Assert.assertEquals((Float)12.1f,maximum);
    }

    //TC 3.1
    @Test
    public void givenString_WhenMaxAtPositionOne_ShouldReturnMaximum() {
        String maximum = Maximum.getMaximumString("Z","Y","X");
        Assert.assertEquals((String)"Z",maximum);
    }

    //TC 3.2
    @Test
    public void givenString_WhenMaxAtPositionTwo_ShouldReturnMaximum() {
        String maximum = Maximum.getMaximumString("Y","Z","X");
        Assert.assertEquals((String)"Z",maximum);
    }

    //TC 3.3
    @Test
    public void givenString_WhenMaxAtPositionThree_ShouldReturnMaximum() {
        String maximum = Maximum.getMaximumString("X","Y","Z");
        Assert.assertEquals((String)"Z",maximum);
    }

}
