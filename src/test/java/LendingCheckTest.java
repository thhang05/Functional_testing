import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class LendingCheckTest {
    /**
     * Kiem thu bien
     */
    @ParameterizedTest(name = "TC{index} => age={0}, income={1}, expected={2}")
    @CsvSource({
            // test case kiem thu bien
            "18, 5000000, true",
            "18, 5000001, true",
            "18, 8000000, true",

            "19, 5000000, true",
            "19, 5000001, true",
            "19, 8000000, true",

            "30, 5000000, true",
            "30, 5000001, true",
            "30, 8000000, true",

            "59, 5000000, false",
            "59, 5000001, false",
            "59, 8000000, true",

            "60, 5000000, false",
            "60, 5000001, false",
            "60, 8000000, true",

            // test case tao do bang quyet dinh
            "15, 3000000, false",
            "25, 4000000, false",
            "30, 6000000, true",
            "40, 9000000, true",
            "58, 4000000, false",
            "57, 7000000, false",
            "56, 10000000, true",
            "65, 5000000, false",

            // test case kiem thu dong dieu khien voi do do C2
            "36, 10000000, true",
            "20, 4000000, false",
            "58, 10000000, true",
            "57, 6000000, false",
            "64, 15000000, false",

    })
    void testLoanEligibility(int age, int income, boolean expected) {
        assertEquals(expected, LendingCheck.isEligibleForLoan(age, income));
    }


}