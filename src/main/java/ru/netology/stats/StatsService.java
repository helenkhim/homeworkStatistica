package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] purchases) {
        int sum = 0;
        for (int value : purchases) {
            sum += value;
        }
        return sum;
    }

    public int averageSum(int[] purchases) {
        return (calculateSum(purchases) / purchases.length);
    }

    public int maxMonth(int[] purchases) {
        int month = 0;
        int counter = 0;
        int max = purchases[0];
        for (int purchase : purchases) {
            counter++;
            if (max <= purchase) {
                max = purchase;
                month = counter;
            }
        }
        return month;
    }

    public int minMonth(int[] purchases) {
        int month = 0;
        int counter = 0;
        int min = purchases[0];
        for (int purchase : purchases) {
            counter++;
            if (min >= purchase) {
                min = purchase;
                month = counter;
            }
        }
        return month;
    }

    public int monthBelowAverage(int[] purchases) {
        int mean = 0;
        int average = averageSum(purchases);
        for (int purchase : purchases) {
            if (average > purchase) {
                mean++;
            }

        }
        return mean;

    }

    public int monthAboveAverage(int[] purchases) {
        int mean = 0;
        int average = averageSum(purchases);
        for (int purchase : purchases) {
            if (average < purchase) {
                mean++;
            }

        }
        return mean;

    }
}