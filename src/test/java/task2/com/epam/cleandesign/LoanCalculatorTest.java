package task2.com.epam.cleandesign;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class LoanCalculatorTest {

    private final IncomeMultiplier incomeMultiplier = new DefaultIncomeMultiplier();

    @Test
    public void studentLoanForYoungPoorPerson() {
        AbstractLoanCalculator calculator = new StudentLoanCalculator(incomeMultiplier);
        assertThat(calculator.calculate(18, 100), is(100));
    }

    @Test
    public void studentLoanForOldPerson() {
        AbstractLoanCalculator calculator = new StudentLoanCalculator(incomeMultiplier);
        assertThat(calculator.calculate(21, 100), is(250));
    }

    @Test
    public void studentLoanForRichPerson() {
        AbstractLoanCalculator calculator = new StudentLoanCalculator(incomeMultiplier);
        assertThat(calculator.calculate(18, 2_000), is(200));
    }

    @Test
    public void carLoanForYoungPoorPerson() {
        AbstractLoanCalculator calculator = new CarLoanCalculator(incomeMultiplier);
        assertThat(calculator.calculate(20, 500), is(2_000));
    }

    @Test
    public void carLoanForAdultPoorPerson() {
        AbstractLoanCalculator calculator = new CarLoanCalculator(incomeMultiplier);
        assertThat(calculator.calculate(45, 500), is(3_000));
    }

    @Test
    public void carLoanForOldPoorPerson() {
        AbstractLoanCalculator calculator = new CarLoanCalculator(incomeMultiplier);
        assertThat(calculator.calculate(60, 500), is(3_500));
    }

    @Test
    public void carLoanForYoungRichPerson() {
        AbstractLoanCalculator calculator = new CarLoanCalculator(incomeMultiplier);
        assertThat(calculator.calculate(20, 2_000), is(4_000));
    }

    @Test
    public void carLoanForAdultRichPerson() {
        AbstractLoanCalculator calculator = new CarLoanCalculator(incomeMultiplier);
        assertThat(calculator.calculate(45, 2_000), is(6_000));
    }

    @Test
    public void carLoanForOldRichPerson() {
        AbstractLoanCalculator calculator = new CarLoanCalculator(incomeMultiplier);
        assertThat(calculator.calculate(60, 2_000), is(7_000));
    }

    @Test
    public void houseLoanForYoungPoorPerson() {
        AbstractLoanCalculator calculator = new HouseLoanCalculator(incomeMultiplier);
        assertThat(calculator.calculate(20, 500), is(100_000));
    }

    @Test
    public void houseLoanForOldPoorPerson() {
        AbstractLoanCalculator calculator = new HouseLoanCalculator(incomeMultiplier);
        assertThat(calculator.calculate(60, 500), is(100_000));
    }

    @Test
    public void houseLoanForYoungRichPerson() {
        AbstractLoanCalculator calculator = new HouseLoanCalculator(incomeMultiplier);
        assertThat(calculator.calculate(20, 65_000), is(200_000));
    }

    @Test
    public void houseLoanForOldRichPerson() {
        AbstractLoanCalculator calculator = new HouseLoanCalculator(incomeMultiplier);
        assertThat(calculator.calculate(60, 65_000), is(400_000));
    }
}
