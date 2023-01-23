package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    long[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


    @Test
        // Сумму всех продаж.
    void shouldSalesAmount() {
        StatsService service = new StatsService();
        int expectedSum = 180;
        int actualSum = service.salesAmount(arr);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
        // Среднюю сумму продаж в месяц.
    void shouldAverageSalesAmount() {
        StatsService service = new StatsService();
        int expectedASale = 15;
        int actualASale = service.averageSalesAmount(arr);

        Assertions.assertEquals(expectedASale, actualASale);
    }

    @Test
        // Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*
    void shouldMaxSales() {
        StatsService service = new StatsService();
        int expectedMonth = 8;
        int actualMonth = service.maxSales(arr);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
        // Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму*.
    void shouldMinSales() {
        StatsService service = new StatsService();
        int expectedMonth = 9;
        int actualMonth = service.minSales(arr);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
        // Количество месяцев, в которых продажи были ниже среднего
    void shouldAMonthsSalesBelowAverage() {
        StatsService service = new StatsService();
        int expectedCount = 5;
        int actualCount = service.aMonthsSalesBelowAverage(arr);

        Assertions.assertEquals(expectedCount, actualCount);
    }

    @Test
        // Количество месяцев, в которых продажи были выше среднего
    void shouldAMonthsSalesAboveAverage() {
        StatsService service = new StatsService();
        int expectedCount = 5;
        int actualCount = service.aMonthsSalesAboveAverage(arr);

        Assertions.assertEquals(expectedCount, actualCount);
    }

}
