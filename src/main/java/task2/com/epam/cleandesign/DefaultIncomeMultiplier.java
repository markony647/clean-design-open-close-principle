package task2.com.epam.cleandesign;

public class DefaultIncomeMultiplier implements IncomeMultiplier {

    @Override
    public int multiply(int loan, int income) {
        return loan * getIncomeMultiplier(income);
    }

    private int getIncomeMultiplier(int income) {
        return income <= 1_000 ? 1 : 2;
    }
}
