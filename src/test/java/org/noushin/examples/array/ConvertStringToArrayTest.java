package org.noushin.examples.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ConvertStringToArrayTest {


    @Test
    public void verifyConvertStringToArray() {
        String string = "Noushin";
        char[] actualArray = ConvertStringToArray.convertStringToArray(string);
        char[] expectedArray = {'N', 'o', 'u', 's', 'h', 'i', 'n'};
        assertArrayEquals(expectedArray, actualArray);
    }

}
