package org.noushin.examples.reverse_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringWithCharAtTest {

    @Test
    public void verifyReverseString() {
        String testString = "unit test";
        String expected = "tset tinu";

        String actual = ReverseStringWithCharAt.reverseString(testString);

        assertEquals(expected, actual);
    }
}