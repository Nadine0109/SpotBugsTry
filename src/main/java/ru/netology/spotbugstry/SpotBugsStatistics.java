package ru.netology.spotbugstry;

public class SpotBugsStatistics {
    /**
     * Calculate index of max income
     *
     * @param incomes - array of incomes
     * @return - index of first max value
     */
    public long findMax(long[] incomes) {
        long current_max_index = 0;
        long current_max = incomes[0];
        for (long income : incomes)
            if (current_max <= income)
                current_max = income;
        return current_max;
    }
    public long calculateSum(long[] incomes) {
        long sum = 0;
        for (long income : incomes) {
            sum += income;
        }
        return sum;
    }

    public long findAverageSum(long[] incomes) {
        long sum = calculateSum(incomes);

        long averageSum = sum / incomes.length;

        return averageSum;
    }
}
