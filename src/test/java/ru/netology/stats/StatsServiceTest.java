package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void calculateSum() {
        StatsService servise = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = servise.calculateSum(purchases);
        assertEquals(180, actual);
    }

    @Test
    void averageSum() {
        StatsService servise = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = servise.averageSum(purchases);
        assertEquals(15, actual);
    }

    @Test
    void maxMonth() {
        StatsService servise = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = servise.maxMonth(purchases);
        assertEquals(8, actual);
    }

    @Test
    void minMonth() {
        StatsService servise = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = servise.minMonth(purchases);
        assertEquals(9, actual);

    }

    @Test
    void monthBelowAverage() {
        StatsService servise = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = servise.monthBelowAverage(purchases);
        assertEquals(5, actual);

    }

    @Test
    void monthAboveAverage() {
        StatsService servise = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = servise.monthAboveAverage(purchases);
        assertEquals(5, actual);
    }
}