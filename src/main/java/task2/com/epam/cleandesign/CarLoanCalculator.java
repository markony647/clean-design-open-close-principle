package task2.com.epam.cleandesign;

public class CarLoanCalculator extends AbstractLoanCalculator {
    private final IncomeMultiplier incomeMultiplier;

    public CarLoanCalculator(IncomeMultiplier incomeMultiplier) {
        this.incomeMultiplier = incomeMultiplier;
    }

    @Override
    int calculate(int age, int income) {
        int loan = 2_000;

        if (age > 50) {
            loan += 1_500;
        } else if (age > 30) {
            loan += 1_000;
        }

        return incomeMultiplier.multiply(loan, income);
    }
}
