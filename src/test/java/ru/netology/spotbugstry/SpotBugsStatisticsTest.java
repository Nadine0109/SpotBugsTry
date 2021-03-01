package ru.netology.spotbugstry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpotBugsStatisticsTest {

    @Test
    void findMax() {
            SpotBugsStatistics service = new SpotBugsStatistics();

            long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
            long expected = 12;

            long actual = service.findMax(incomesInBillions);

            assertEquals(expected, actual);
        }
    }