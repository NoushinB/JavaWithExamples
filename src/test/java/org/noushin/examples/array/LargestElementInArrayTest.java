package org.noushin.examples.array;

import org.junit.jupiter.api.Test;

class LargestElementInArrayTest {
    @Test
    public void verifyFindMaxInArray() {
        int[] myArray = {2, 44, 33, 3, 5};
        int actual = LargestElementInArray.findLargestElementInArray(myArray);

        assert (actual == 44);
    }

    @Test
    public void verifyFindMaxInEmptyArray() {
        int[] myArray = {};
        int actual = LargestElementInArray.findLargestElementInArray(myArray);

        assert (actual == 0);
    }
}