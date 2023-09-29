package ru.netology.stats.fox7.services;

public class StatsService {

    public int totalSales(int[] stat) {

        int sum = 0;
        for (int elements : stat) {

            sum += elements;
        }

        return sum;


    }

    public int averageSales(int[] stat) {

        int average = totalSales(stat) / stat.length;
        return average;
    }

    public int maxSales(int[] stat) {
        int maxSale = stat[0];
        int maxMonth = 0;

        for (int i = 0; i < stat.length; i++) {
            if (stat[i] >= maxSale) {
                maxSale = stat[i];
                maxMonth = i;
            }


        }

        return maxMonth + 1;
    }

    public int minSales(int[] stat) {
        int minMonth = 0;

        for (int i = 0; i < stat.length; i++) {
            if (stat[i] <= stat[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int minStat(int[] stat) {

        int middle = averageSales(stat); // 15
        int month = 0;

        for (int element : stat) {
            if (element < middle) {
                month = month + 1;
            }


        }
        return month;


    }
    public int maxStat(int[] stat) {
        int mid = averageSales(stat);
        int count = 0;

        for (int element : stat) {
            if (element > mid) {
                count++;
            }
        }
        return count;
    }



}





