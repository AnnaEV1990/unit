package ru.netology.service;

import org.testng.annotations.Test;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void testWhenNothingWasSpent() {
        org.testng.Assert.assertEquals(service.remain(0), 1000);
    }

    @org.testng.annotations.Test
    public void testWhenCalculatedCorrectly() {
        org.testng.Assert.assertEquals(service.remain(400), 600);
    }

    @org.testng.annotations.Test
    public void testAmountmoreBoundary() {
        org.testng.Assert.assertEquals(service.remain(1200), 800);
    }

    @org.testng.annotations.Test
    public void testWhenAmountEqualsBoundary() {
        org.testng.Assert.assertEquals(service.remain(1000), 0);
    }

    @org.testng.annotations.Test
    public void testAmoutNegative() {
        org.testng.Assert.assertEquals(service.remain(-1), 0);
    }
}
