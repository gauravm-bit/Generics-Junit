import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {

    //TC 1.1
    @Test
    public void givenIntegers_WhenMaxAtPositionOne_ShouldReturnMaximum() {
        Integer maximum = Maximum.getMaximum(19,17,15);
        Assert.assertEquals((Integer)19,maximum);
    }

    //TC 1.2
    @Test
    public void givenIntegers_WhenMaxAtPositionTwo_ShouldReturnMaximum() {
        Integer maximum = Maximum.getMaximum(17, 19, 15);
        Assert.assertEquals((Integer)19,maximum);
    }

    //TC 1.3
    @Test
    public void givenIntegers_WhenMaxAtPositionThree_ShouldReturnMaximum() {
        Integer maximum = Maximum.getMaximum(15, 17, 19);
        Assert.assertEquals((Integer)19,maximum);
    }

    //TC 2.1
    @Test
    public void givenFloats_WhenMaxAtPositionOne_ShouldReturnMaximum() {
        Float maximum = Maximum.getMaximum(12.1f,11.1f,10.1f);
        Assert.assertEquals((Float)12.1f,maximum);
    }

    //TC 2.2
    @Test
    public void givenFloats_WhenMaxAtPositionTwo_ShouldReturnMaximum() {
        Float maximum = Maximum.getMaximum(11.1f,12.1f,10.1f);
        Assert.assertEquals((Float)12.1f,maximum);
    }

    //TC 2.3
    @Test
    public void givenFloats_WhenMaxAtPositionThree_ShouldReturnMaximum() {
        Float maximum = Maximum.getMaximum(11.1f,10.1f,12.1f);
        Assert.assertEquals((Float)12.1f,maximum);
    }

    //TC 3.1
    @Test
    public void givenString_WhenMaxAtPositionOne_ShouldReturnMaximum() {
        String maximum = Maximum.getMaximum("platypus","ant","horse");
        Assert.assertEquals((String)"platypus",maximum);
    }

    //TC 3.2
    @Test
    public void givenString_WhenMaxAtPositionTwo_ShouldReturnMaximum() {
        String maximum = Maximum.getMaximum("ant","platypus","horse");
        Assert.assertEquals((String)"platypus",maximum);
    }

    //TC 3.3
    @Test
    public void givenString_WhenMaxAtPositionThree_ShouldReturnMaximum() {
        String maximum = Maximum.getMaximum("ant","horse","platypus");
        Assert.assertEquals((String)"platypus",maximum);
    }

}
