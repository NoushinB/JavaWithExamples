package org.noushin.examples.capitalize_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CapitalizeStringExampleTest {
    @Test
    public void VerifyCapitalizeString() {
        // Given
        String testString = "noushin";
        String expected = "NOUSHIN";

        // When
        String actual = CapitalizeStringExample.capitalizeString(testString);

        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void VerifyCapitalizeStringWhenItIsOnlyOneChar() {
        // Given
        String testString = "f";
        String expected = "F";

        // When
        String actual = CapitalizeStringExample.capitalizeString(testString);

        // Then
        assertEquals(expected, actual);
    }
}