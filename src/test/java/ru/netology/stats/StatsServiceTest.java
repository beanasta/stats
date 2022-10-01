package ru.netology.stats;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {


    @Test

    public void shouldCalculateSumAllSalesBetweenEnds() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 1};

        long expectedSumAllSales = 163;

        long actualSumAllSales = service.sumAllSales(sales);

        Assertions.assertEquals(expectedSumAllSales, actualSumAllSales);


    }

    @Test

    public void shouldCalculateAverageMonthlySalesBetweenEnds() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 113, 105, 17, 20, 19, 200, 7, 14, 104, 190};

        long expectedAverageMonthlySales = 67;

        long actualAverageMonthlySales = service.averageMonthlySales(sales);

        Assertions.assertEquals(expectedAverageMonthlySales, actualAverageMonthlySales);


    }


    @Test

    public void shouldFindMonthMaxSalesBetweenEnds() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 1};

        int expectedMaxMonth = 8;

        int actualMaxMonth = service.monthMaxSales(sales);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }


    @Test


    public void shouldFindMonthMinSalesBetweenEnds() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 1};

        int expectedMinMonth = 12;

        int actualMinMonth = service.monthMinSales(sales);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);


    }


    @Test

    public void shouldCalcNumberMonthsBelowAverageSales() {

        StatsService service = new StatsService();

        long[] sales = {18, 15, 28, 25, 17, 20, 19, 39, 71, 14, 104, 50};

        int expectedNumberMonths = 8;

        int actualNumberMonths = service.numberMonthsBelowAverageSales(sales);

        Assertions.assertEquals(expectedNumberMonths, actualNumberMonths);


    }

    @Test

    public void shouldCalcNumberMonthsAboveAverageSales() {

        StatsService service = new StatsService();

        long[] sales = {18, 15, 28, 25, 17, 20, 19, 39, 71, 14, 104, 50};

        int expectedNumberMonths = 4;

        int actualNumberMonths = service.numberMonthsAboveAverageSales(sales);

        Assertions.assertEquals(expectedNumberMonths, actualNumberMonths);


    }


}


