package task2.com.epam.cleandesign;

public class CarLoanCalculator extends AbstractLoanCalculator {

    public CarLoanCalculator(IncomeMultiplier incomeMultiplier) {
        super(incomeMultiplier);
    }

    @Override
    int calculateBeforeApplyingMultiplier(int age, int income) {
        int loan = 2_000;

        if (age > 50) {
            loan += 1_500;
        } else if (age > 30) {
            loan += 1_000;
        }
        return loan;
    }
}
