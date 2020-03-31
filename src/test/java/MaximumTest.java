import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {

    Maximum maximumObject;
    //TC 1.1
    @Test
    public void givenIntegers_WhenMaxAtPositionOne_ShouldReturnMaximum() {
        Integer maximumInt = (Integer)maximumObject.getMaximum(69,17,15,19);
        Assert.assertEquals((Integer)69,maximumInt);
    }

    //TC 1.2
    @Test
    public void givenIntegers_WhenMaxAtPositionTwo_ShouldReturnMaximum() {
        Integer maximumInt = (Integer)maximumObject.getMaximum(17,19,15,13);
        Assert.assertEquals((Integer)19,maximumInt);
    }

    //TC 1.3
    @Test
    public void givenIntegers_WhenMaxAtPositionThree_ShouldReturnMaximum() {
        Integer maximumInt = (Integer)maximumObject.getMaximum(19,17,55,43);
        Assert.assertEquals((Integer)55,maximumInt);
    }

    //TC 2.1
    @Test
    public void givenFloats_WhenMaxAtPositionOne_ShouldReturnMaximum() {
        Float maximumFloat = (Float) maximumObject.getMaximum(12.1f,11.1f,10.1f,9.8f);
        Assert.assertEquals((Float)12.1f,maximumFloat);
    }

    //TC 2.2
    @Test
    public void givenFloats_WhenMaxAtPositionTwo_ShouldReturnMaximum() {
        Float maximumFloat = (Float) maximumObject.getMaximum(11.1f,69.69f,10.1f,55.55f);
        Assert.assertEquals((Float)69.69f,maximumFloat);
    }

    //TC 2.3
    @Test
    public void givenFloats_WhenMaxAtPositionThree_ShouldReturnMaximum() {
        Float maximumFloat = (Float) maximumObject.getMaximum(12.1f,11.1f,15.1f,13.13f);
        Assert.assertEquals((Float)15.1f,maximumFloat);
    }

    //TC 3.1
    @Test
    public void givenString_WhenMaxAtPositionOne_ShouldReturnMaximum() {
        String maximum = (String) maximumObject.getMaximum("platypus","ant","horse","dog");
        Assert.assertEquals((String)"platypus",maximum);
    }

    //TC 3.2
    @Test
    public void givenString_WhenMaxAtPositionTwo_ShouldReturnMaximum() {
        String maximum = (String) maximumObject.getMaximum("cat","elephant","ant","cat");
        Assert.assertEquals((String)"elephant",maximum);
    }

    //TC 3.3
    @Test
    public void givenString_WhenMaxAtPositionThree_ShouldReturnMaximum() {
        String maximum = (String) maximumObject.getMaximum("dog","ant","platypus","horse","cat","human");
        Assert.assertEquals((String)"platypus",maximum);
    }

}
