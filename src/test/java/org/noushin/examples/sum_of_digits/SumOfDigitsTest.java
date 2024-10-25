package org.noushin.examples.sum_of_digits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfDigitsTest {

    @Test
    public void testSumOfDigits_positiveNumber() {
        int num = 1234;
        int actualResult = SumOfDigits.sumOfDigits(num);
        int expectResult = 10;
        assertEquals(expectResult, actualResult);

    }


}
