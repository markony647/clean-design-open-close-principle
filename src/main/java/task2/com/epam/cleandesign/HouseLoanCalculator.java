package task2.com.epam.cleandesign;

public class HouseLoanCalculator extends AbstractLoanCalculator {
    private final IncomeMultiplier incomeMultiplier;

    public HouseLoanCalculator(IncomeMultiplier incomeMultiplier) {
        this.incomeMultiplier = incomeMultiplier;
    }

    @Override
    int calculate(int age, int income) {
        int loan = 100_000;

        if (age > 30 && income > loan / 2) {
            loan *= 2;
        }

        return incomeMultiplier.multiply(loan, income);
    }
}
