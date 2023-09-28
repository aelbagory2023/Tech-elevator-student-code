package com.techelevator;

import org.junit.Test;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DateFashionTest {
    @Test
    public void getATableTestAssertLowScoreReturnsNo() {
        //Arrange
        DateFashion testObject = new DateFashion();
        //Act
        int fashionScore = testObject.getATable(1, 5);

        Assert.assertEquals(0, fashionScore);
    }

    @Test
    public void getATableTestAssertHighScoreReturnsYes() {
        //Arrange
        DateFashion testObject = new DateFashion();
        //Act
        int fashionScore = testObject.getATable(4, 9);

        Assert.assertEquals(2, fashionScore);
    }
    @Test
    public void getATableTestAssertMiddleScoreReturnsMaybe() {
        //Arrange
        DateFashion testObject = new DateFashion();
        //Act
        int fashionScore = testObject.getATable(6, 5);

        Assert.assertEquals(1, fashionScore);
    }
    }
