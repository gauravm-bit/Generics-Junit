import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {

    Maximum maximumObject;
    //TC 1.1
    @Test
    public void givenIntegers_WhenMaxAtPositionOne_ShouldReturnMaximum() {
        maximumObject = new Maximum(19,17,15);
        Integer maximumInt = (Integer)maximumObject.getMaximum();
        Assert.assertEquals((Integer)19,maximumInt);
    }

    //TC 1.2
    @Test
    public void givenIntegers_WhenMaxAtPositionTwo_ShouldReturnMaximum() {
        maximumObject = new Maximum(17,19,15);
        Integer maximumInt = (Integer)maximumObject.getMaximum();
        Assert.assertEquals((Integer)19,maximumInt);
    }

    //TC 1.3
    @Test
    public void givenIntegers_WhenMaxAtPositionThree_ShouldReturnMaximum() {
        maximumObject = new Maximum(15,17,19);
        Integer maximumInt = (Integer)maximumObject.getMaximum();
        Assert.assertEquals((Integer)19,maximumInt);
    }

    //TC 2.1
    @Test
    public void givenFloats_WhenMaxAtPositionOne_ShouldReturnMaximum() {
        maximumObject = new Maximum(12.1f,11.1f,10.1f);
        Float maximumFloat = (Float) maximumObject.getMaximum();
        Assert.assertEquals((Float)12.1f,maximumFloat);
    }

    //TC 2.2
    @Test
    public void givenFloats_WhenMaxAtPositionTwo_ShouldReturnMaximum() {
        maximumObject = new Maximum(11.1f,12.1f,10.1f);
        Float maximumFloat = (Float) maximumObject.getMaximum();
        Assert.assertEquals((Float)12.1f,maximumFloat);
    }

    //TC 2.3
    @Test
    public void givenFloats_WhenMaxAtPositionThree_ShouldReturnMaximum() {
        maximumObject = new Maximum(10.1f,11.1f,12.1f);
        Float maximumFloat = (Float) maximumObject.getMaximum();
        Assert.assertEquals((Float)12.1f,maximumFloat);
    }

    //TC 3.1
    @Test
    public void givenString_WhenMaxAtPositionOne_ShouldReturnMaximum() {
        maximumObject = new Maximum("platypus","ant","horse");
        String maximum = (String) maximumObject.getMaximum();
        Assert.assertEquals((String)"platypus",maximum);
    }

    //TC 3.2
    @Test
    public void givenString_WhenMaxAtPositionTwo_ShouldReturnMaximum() {
        maximumObject = new Maximum("ant","platypus","horse");
        String maximum = (String) maximumObject.getMaximum();
        Assert.assertEquals((String)"platypus",maximum);
    }

    //TC 3.3
    @Test
    public void givenString_WhenMaxAtPositionThree_ShouldReturnMaximum() {
        maximumObject = new Maximum("horse","ant","platypus");
        String maximum = (String) maximumObject.getMaximum();
        Assert.assertEquals((String)"platypus",maximum);
    }

}
