import ru.netology.stats.fox7.services.StatsService;

public class Main {

    public static void main(String[] args) {

        StatsService service = new StatsService();

        int[] stat = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int amount = service.totalSales(stat);
        int medium = service.averageSales(stat);
        int min = service.minSales(stat);
        int max = service.maxSales(stat);
        int minDay = service.minStat(stat);
        int maxDay = service.maxStat(stat);


        System.out.println("Сумма всех продаж" + "-" + amount +
                "   " + "Продаж в среднем" + "-" + medium + "   " +
                "Месяц минимальных продаж" + "-" + min + "   " +
                "Месяц максимальных продаж" + "-" + max + "   " +
                "Месяцы ниже среднего" + "-" + minDay +
                "   " + "Месяцы выше среднего" + "-" + maxDay);


    }
}
