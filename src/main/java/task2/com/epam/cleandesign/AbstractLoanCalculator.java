package task2.com.epam.cleandesign;

public abstract class AbstractLoanCalculator {

    private final IncomeMultiplier incomeMultiplier;

    public AbstractLoanCalculator(IncomeMultiplier incomeMultiplier) {
        this.incomeMultiplier = incomeMultiplier;
    }

    abstract int calculateBeforeApplyingMultiplier(int age, int income);

    public int calculate(int age, int income) {
        int loan = calculateBeforeApplyingMultiplier(age, income);
        return incomeMultiplier.multiply(loan, income);
    }
}
