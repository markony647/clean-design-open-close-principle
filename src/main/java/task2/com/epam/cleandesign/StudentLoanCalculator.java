package task2.com.epam.cleandesign;

public class StudentLoanCalculator extends AbstractLoanCalculator {

    public StudentLoanCalculator(IncomeMultiplier incomeMultiplier) {
        super(incomeMultiplier);
    }

    @Override
    int calculateBeforeApplyingMultiplier(int age, int income) {
        int loan = 100;

        if (age >= 21) {
            loan += 150;
        }
        return loan;
    }
}
