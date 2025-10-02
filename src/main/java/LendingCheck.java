public class LendingCheck {
    public static boolean isEligibleForLoan(int age, int monthlyIncome) {
        if (age >= 18 && age <= 55) {
            return monthlyIncome >= 5000000;
        }

        if (age >= 56 && age <= 60) {
            return monthlyIncome >= 8000000;
        }

        return false;
    }
}
