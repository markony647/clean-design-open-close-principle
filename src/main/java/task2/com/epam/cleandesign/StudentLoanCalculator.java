package task2.com.epam.cleandesign;

public class StudentLoanCalculator extends AbstractLoanCalculator {
    private final IncomeMultiplier incomeMultiplier;

    public StudentLoanCalculator(IncomeMultiplier incomeMultiplier) {
        this.incomeMultiplier = incomeMultiplier;
    }

    @Override
    int calculate(int age, int income) {
        int loan = 100;

        if (age >= 21) {
            loan += 150;
        }
        return incomeMultiplier.multiply(loan, income);
    }
}
