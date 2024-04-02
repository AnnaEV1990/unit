package ru.netology.service;

import org.testng.annotations.Test;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemainBoundaryValuesOne() {
        org.testng.Assert.assertThrows(RuntimeException.class, () -> {
            service.remain(-1);
        });

    }
}
