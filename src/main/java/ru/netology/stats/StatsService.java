package ru.netology.stats;

import java.util.Arrays;

public class StatsService {


    public long SumAllSales(long[] sales) {

        long sumAllSales = Arrays.stream(sales).sum();

        return sumAllSales;


    }


    public long AverageMonthlySales(long[] sales) {

        long sumAllSales = Arrays.stream(sales).sum();

        long averageMonthlySales = sumAllSales / sales.length;

        return averageMonthlySales;


    }


    public int MonthMaxSales(long[] sales) {

        int maxMonth = 0;
        int month = 0;

        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;

    }


    public int MonthMinSales(long[] sales) {

        int minMonth = 0;
        int month = 0;

        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;

    }


    public int NumberMonthsBelowAverageSales(long[] sales) {

        int numberMonth = 0;

        long sumAllSales = Arrays.stream(sales).sum();

        long averageMonthlySales = sumAllSales / sales.length;

        for (long sale : sales) {
            if (sale < averageMonthlySales) {

                numberMonth = numberMonth + 1;
            }

        }

        return numberMonth;
    }

    public int NumberMonthsAboveAverageSales(long[] sales) {

        int numberMonth = 0;


        long sumAllSales = Arrays.stream(sales).sum();

        long averageMonthlySales = sumAllSales / sales.length;

        for (long sale : sales) {
            if (sale > averageMonthlySales) {

                numberMonth = numberMonth + 1;
            }

        }

        return numberMonth;
    }


}



