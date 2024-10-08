package org.noushin.examples.message;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

public class MessageUtilsNegativeTest {

    String message = null;
    String expected = null;

    @Test

    public void verifyMessageUtils_EmptyMessage() {
        assertNull(expected, message);
    }
}
