package org.noushin.examples.capitalize_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CapitalizeStringExampleTest {
    @Test
    public void VerifyCapitalizeString() {
        String testString = "noushin";
        String expected = "NOUSHIN";

        String actual = CapitalizeStringExample.capitalizeString(testString);

        assertEquals(expected, actual);
    }

    @Test
    public void VerifyCapitalizeStringWhenItIsOnlyOneChar() {
        String testString = "f";
        String expected = "F";

        String actual = CapitalizeStringExample.capitalizeString(testString);

        assertEquals(expected, actual);
    }
}