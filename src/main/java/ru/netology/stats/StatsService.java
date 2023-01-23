package ru.netology.stats;

public class StatsService {

    public int salesAmount(long[] sales) {
        int sum = 0; // переменная для суммы продаж
        for (long sale : sales) {
            // sale - продажи в рассматриваемом месяце
            sum += sale;
        }
        return sum;
    }

    public int averageSalesAmount(long[] sales) {
        int averageSA = salesAmount(sales) / (sales.length);
        return averageSA;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int aMonthsSalesBelowAverage(long[] sales) {
        int count = 0; // счетчик
        int averageSalesAmount = averageSalesAmount(sales); // средняя сумма продаж
        for (long sale : sales) {
            // sale - продажи в рассматриваемом месяце
            if (sale < averageSalesAmount) {
                count++;
            }
        }
        return count;
    }

    public int aMonthsSalesAboveAverage(long[] sales) {
        int count = 0; // счетчик
        int averageSalesAmount = averageSalesAmount(sales); // средняя сумма продаж
        for (long sale : sales) {
            // sale - продажи в рассматриваемом месяце
            if (sale > averageSalesAmount) {
                count++;
            }
        }
        return count;
    }
}
