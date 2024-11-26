package org.noushin.examples.array;

import org.junit.jupiter.api.Test;

public class FinedSmallestElementInArrayTest {
    @Test
    public void verifyFinedSmallestElementInArray(){

        int[] array={33,1,55,2,0};
        int actualSmallElement=FinedSmallestElementInArray.smallestElement(array);
        assert(actualSmallElement==0);
    }
}
