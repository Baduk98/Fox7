package ru.netology.stats.fox7.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void testCalcAmount() {
        StatsService service = new StatsService();

        int[] stat = {10, 15, 20, 25};
        int expected = 70;
        int actual = service.totalSales(stat);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcMedium() {
        StatsService service = new StatsService();

        int[] stat = {1, 2, 3, 4, 5};
        int expected = 3;
        int actual = service.averageSales(stat);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testCalcMin() {
        StatsService service = new StatsService();

        int[] stat = {4, 23, 2, 22, 233, 1};
        int expected = 6;
        int actual = service.minSales(stat);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testCalcMax() {
        StatsService service = new StatsService();

        int[] stat = {100, 101, 103, 99, 2, 0, 120};
        int expected = 7;
        int actual = service.maxSales(stat);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testCalcMinDay() {
        StatsService service = new StatsService();

        int[] stat = {10, 5, 5, 10, 1};
        int expected = 3;
        int actual = service.minStat(stat);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testCalcMaxDay() {
        StatsService service = new StatsService();

        int[] stat = {20, 1, 4, 4, 14};
        int expected = 2;
        int actual = service.maxStat(stat);

        Assertions.assertEquals(expected, actual);
    }
}

