package ru.netology.stats;

public class StatsService {

    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
//            sum = sum + sale;
            sum += sale;

        }
        return sum;
    }

    public int calculateAvg(int[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;


    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int numberBelowAvg(int[] sales) {
        int number = 0;
        int avg = calculateAvg(sales);
        for (int sale : sales) {
            if (sale < avg) {
                number++;
            }

        }
        return number;
    }

    public int numberAboveAvg(int[] sales) {
        int amount = 0;
        int avg = calculateAvg(sales);
        for (int sale : sales) {
            if (sale > avg) {
                amount++;
            }

        }
        return amount;
    }
}

