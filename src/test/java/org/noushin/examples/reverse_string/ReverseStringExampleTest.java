package org.noushin.examples.reverse_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringExampleTest {

    @Test
    public void verifyReverseString() {
        String testString = "unit test";
        String expected = "tset tinu";

        String actual = ReverseStringExample.reverseString(testString);

        assertEquals(expected, actual);
    }
}