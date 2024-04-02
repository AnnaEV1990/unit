package ru.netology.service;

import org.junit.Test;


public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void testWhenNothingWasSpent() {
        org.junit.Assert.assertEquals(service.remain(0), 1000);
    }

    @Test
    public void testWhenCalculatedCorrectly() {
        org.junit.Assert.assertEquals(service.remain(400), 600);
    }

    @Test
    public void testAmountMoreBoundary() {
        org.junit.Assert.assertEquals(service.remain(1200), 800);
    }

    @Test

    public void testWhenAmountEqualsBoundary() {
        org.testng.Assert.assertEquals(service.remain(1000), 0);
    }


    @Test
    public void testAmountNegative() {
        org.testng.Assert.assertEquals(service.remain(-1), 0);
    }
}
