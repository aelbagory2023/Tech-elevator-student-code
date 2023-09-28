package com.techelevator;

import org.junit.Test;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FrontTimesTest {
    @Test
    public void generateStringTestAssertLongString() {
        //Arrange
        FrontTimes testObject = new FrontTimes();
        //Act
        String string = testObject.generateString("Cookies", 3);

        //Assert

        Assert.assertEquals("CooCooCoo", string);
    }
    @Test
    public void generateStringTestAssertShortString() {
        //Arrange
        FrontTimes testObject = new FrontTimes();
        //Act
        String string = testObject.generateString("D2", 4);

        //Assert

        Assert.assertEquals("D2D2D2D2", string);
    }


}
