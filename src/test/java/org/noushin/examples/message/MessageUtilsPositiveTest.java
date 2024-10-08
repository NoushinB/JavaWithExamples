package org.noushin.examples.message;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MessageUtilsPositiveTest {
    String message="Hello world!";
    String expected="Hello world!";

    @Test
    public void verifyMessageUtils(){

    assertEquals(expected,message);

    }
}
