package ru.netology.stats.fox7.services;

public class StatsService {

    public int totalSales(int[] stat) {

        int sum = stat[0] + stat[1] + stat[2] + stat[3] + stat[4] + stat[5] + stat[6] + stat[7] + stat[8] + stat[9] + stat[10] + stat[11];

        return sum;


    }

    public int averageSales(int[] stat) {

        int average = totalSales(stat) / 12;
        return average;
    }

    public int maxSales(int[] stat) {
        int maxMonth = stat[0];

        for (int i = 1; i < stat.length; i++) {
            if (stat[i] >= maxMonth) {
                maxMonth = stat[i];
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


}





