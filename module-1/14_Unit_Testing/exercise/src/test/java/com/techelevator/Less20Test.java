package com.techelevator;
import org.junit.Test;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Less20Test {
    @Test
    public void oneLessThanMultipleOf20TestAssertTrue() {
        //Arrange
        Less20 testObject = new Less20();
        //Act
        boolean number = testObject.isLessThanMultipleOf20(59);

        //Assert

        Assert.assertEquals(true, number);
    }
    @Test
    public void oneLessThanMultipleOf20TestAssertFalse() {
        //Arrange
        Less20 testObject = new Less20();
        //Act
        boolean number = testObject.isLessThanMultipleOf20(45);

        //Assert

        Assert.assertEquals(false, number);

    }
    @Test
    public void TwoLessThanMultipleOf20TestAssertTrue() {
        //Arrange
        Less20 testObject = new Less20();
        //Act
        boolean number = testObject.isLessThanMultipleOf20(38);

        //Assert

        Assert.assertEquals(true, number);
    }
    @Test
    public void TwoLessThanMultipleOf20TestAssertFalse() {
        //Arrange
        Less20 testObject = new Less20();
        //Act
        boolean number = testObject.isLessThanMultipleOf20(146);

        //Assert

        Assert.assertEquals(false, number);
    }
}
