package com.techelevator;

import org.junit.Test;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CigarPartyTest {
    @Test
    public void havePartyTestHaveMinimumCigars() {
        CigarParty testObject = new CigarParty();
        boolean party = testObject.haveParty(39, false);

        Assert.assertEquals(false, party );
    }
    @Test
    public void havePartyTestMaximumCigarCount() {
        CigarParty testObject = new CigarParty();

        boolean party = testObject.haveParty(61, false);

        Assert.assertEquals(false, party );
    }
    @Test
    public void havePartyTestMaximumOnWeekend() {
        CigarParty testObject = new CigarParty();

        boolean party = testObject.haveParty(200, true);

        Assert.assertEquals(true, party );
    }
}
