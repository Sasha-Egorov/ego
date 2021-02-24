package com.egorov.homeworks.homework14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void testAverageAge() {
        CovidStat stat = new CovidStat(new DataProvider().provide());
        assertEquals(41, stat.getAverageAge());
    }
    @Test
    void testAverageHeight() {
        CovidStat stat = new CovidStat(new DataProvider().provide());
        assertEquals(165.75, stat.getAverageHeight());
    }
    @Test
    void testAverageWeight() {
        CovidStat stat = new CovidStat(new DataProvider().provide());
        assertEquals(77.5, stat.getAverageWeight());
    }
    @Test
    void testPopularMailDomain() {
        CovidStat stat = new CovidStat(new DataProvider().provide());
        assertEquals("gmail.com", stat.getPopularMailDomain());
    }
    @Test
    void testPopularMailName() {
        CovidStat stat = new CovidStat(new DataProvider().provide());
        assertEquals("Mike", stat.getMostPopularName());
    }


}