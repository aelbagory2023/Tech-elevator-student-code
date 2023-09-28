package com.techelevator;
import org.junit.Test;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NonStartTest {
    @Test
    public void getPartialStringTestAssertNormalString() {
        //Arrange
        NonStart testObject = new NonStart();
        //Act
        String newString = testObject.getPartialString("Yo","Cow");


        //Assert

        Assert.assertEquals("oow", newString);
    }
    @Test
    public void getPartialStringTestAssertTooShortString() {
        //Arrange
        NonStart testObject = new NonStart();
        //Act
        String newString = testObject.getPartialString("o","");


        //Assert

        Assert.assertEquals("", newString);
    }
}
