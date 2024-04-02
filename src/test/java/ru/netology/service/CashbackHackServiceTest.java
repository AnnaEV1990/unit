package ru.netology.service;

import org.testng.annotations.Test;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

 //   @Test
  //  public void testRemainBoundaryValuesTwo() {
  //      org.testng.Assert.assertEquals(service.remain(0), 1000);
   // }

    @org.testng.annotations.Test
    public void testRemainCriticalPath() {
        org.testng.Assert.assertEquals(service.remain(400), 600);
    }
}
