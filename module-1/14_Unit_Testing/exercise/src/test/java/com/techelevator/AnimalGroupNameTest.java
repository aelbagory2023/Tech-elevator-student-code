package com.techelevator;

import org.junit.Test;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AnimalGroupNameTest {

    @Test
    public void getHerdTestAssertRhinoReturnsCrash() {
        //Arrange
        AnimalGroupName testObject = new AnimalGroupName();
        //Act
        String group = testObject.getHerd("Rhino");

        //Assert

        Assert.assertEquals("Crash", group);
    }
    @Test
    public void getHerdTestAssertChickenReturnsUnknown() {
        //Arrange
        AnimalGroupName testObject = new AnimalGroupName();
        //Act
        String group = testObject.getHerd("chicken");

        //Assert

        Assert.assertEquals("unknown", group);
    }
    @Test
    public void getHerdTestAssertEmptyStringAndNullReturnUnknown() {
        //Arrange
        AnimalGroupName testObject = new AnimalGroupName();
        //Act
        String nullTest = testObject.getHerd("Null");
        String emptyString = testObject.getHerd("");
        //Assert

        Assert.assertEquals("unknown", nullTest);
        Assert.assertEquals("unknown", emptyString);

    }
    @Test
    public void getHerdTestCheckForCaseSensitivity() {
        //Arrange
        AnimalGroupName testObject = new AnimalGroupName();
        //Act
        String murder = testObject.getHerd("cRoW");
        String floats = testObject.getHerd("CrOcoDile");

        //Assert

        Assert.assertEquals("Murder", murder);
        Assert.assertEquals("Float", floats);
    }
}
