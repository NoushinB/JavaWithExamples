package org.noushin.examples.swap_two_strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapStringsExampleTest {
    @Test
    public void verifySwapStrings() {
        String testString1 = "noushin";
        String testString2 = "b";
        String[] expect = {"b", "noushin"};

        String[] actual = SwapStringsExample.swapString(testString1, testString2);

        assertArrayEquals(expect, actual);

    }

}