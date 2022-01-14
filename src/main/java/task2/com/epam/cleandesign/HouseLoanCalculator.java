package task2.com.epam.cleandesign;

public class HouseLoanCalculator extends AbstractLoanCalculator {

    public HouseLoanCalculator(IncomeMultiplier incomeMultiplier) {
        super(incomeMultiplier);
    }

    @Override
    int calculateBeforeApplyingMultiplier(int age, int income) {
        int loan = 100_000;

        if (age > 30 && income > loan / 2) {
            loan *= 2;
        }
        return loan;
    }
}
