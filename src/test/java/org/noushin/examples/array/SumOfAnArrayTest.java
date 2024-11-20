package org.noushin.examples.array;

import org.junit.jupiter.api.Test;

public class SumOfAnArrayTest {

    @Test
    public void verifySumOfAnArray(){
        int[] array={3,4,7};
        int actual=SumOfAnArray.sumOfArray(array);
        assert (actual==14);
    }
}
