package com.techelevator;
import org.junit.Test;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StringBitsTest {
    @Test
    public void getBitsTestAssertOddString() {
        //Arrange
        StringBits testObject = new StringBits();
        //Act
        String newString = testObject.getBits("Yohonobro");


        //Assert

        Assert.assertEquals("Yhnbo", newString);
    }
    @Test
    public void getBitsTestAssertEvenString() {
        //Arrange
        StringBits testObject = new StringBits();
        //Act
        String newString = testObject.getBits("Convenient");


        //Assert

        Assert.assertEquals("Cnein", newString);
    }
    @Test
    public void getBitsTestAssertNullString() {
        //Arrange
        StringBits testObject = new StringBits();
        //Act
        String newString = testObject.getBits("");


        //Assert

        Assert.assertEquals("", newString);
    }
}
