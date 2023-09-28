package com.techelevator;

import org.junit.Test;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AnimalGroupNameTest {

    @Test
    public void getHerdTestAssertRhinoGetsCrash() {
        //Arrange
        AnimalGroupName testObject = new AnimalGroupName(); //instantiate an AnimalGroupName object

        //Act
        String group = testObject.getHerd("Rhino"); //run the method that we're testing and get a result

        //Assert
        Assert.assertEquals("Crash", group);
    }

    @Test
    public void getHerdTestAssertChickenReturnsUnknown() {
        //Arrange
        AnimalGroupName testObject = new AnimalGroupName(); //instantiate an AnimalGroupName object

        //Act
        String group = testObject.getHerd("Chicken"); //run the method that we're testing and get a result

        //Assert
        Assert.assertEquals("unknown", group);
    }

    @Test
    public void getHerdTestAssertEmptyStringAndNullReturnUnknown() {
        //Arrange
        AnimalGroupName testObject = new AnimalGroupName(); //instantiate an AnimalGroupName object

        //Act
        String nullTest = testObject.getHerd(null); //run the method that we're testing and get a result
        String emptyStringTest = testObject.getHerd("");

        //Assert
        Assert.assertEquals("Null should return unknown", "unknown", nullTest);
        Assert.assertEquals("Empty string should return unknown", "unknown", emptyStringTest);
    }

    @Test
    public void getHerdTestCheckForCaseSensitivity() {
        //Arrange
        AnimalGroupName testObject = new AnimalGroupName(); //instantiate an AnimalGroupName object

        //Act
        String murder = testObject.getHerd("CrOw"); //run the method that we're testing and get a result
        String floats = testObject.getHerd("cRoCoDILe");

        //Assert
        Assert.assertEquals("Murder", murder);
        Assert.assertEquals("Float", floats);
    }


}
