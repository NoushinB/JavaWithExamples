package org.noushin.examples.fibonacci_series;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciSeriesExampleTest {
    @Test
    public void verifyFibonacciSeries(){

        int[] expected={0,1,1,2,3};
        int[] actual=FibonacciSeriesExample.fibonacciSeries(5);
        assertArrayEquals(expected,actual);
    }

}