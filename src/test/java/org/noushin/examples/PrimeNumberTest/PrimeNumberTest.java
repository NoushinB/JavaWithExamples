package org.noushin.examples.PrimeNumberTest;

import org.junit.jupiter.api.Test;
import org.noushin.examples.array.SortAnArray;
import org.noushin.examples.prime_number.PrimeNumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeNumberTest {

    @Test
    public void   verifyPrimeNumber(){
        int primeNum=13;

        boolean expectResult=true;
        boolean actualResult= PrimeNumber.checkPrimeNumber(primeNum);

        assertEquals(expectResult,actualResult);
    }
    @Test
    public void verifyNonPrimeNumber(){
        int nonPrimeNum=10;
        boolean expectResult=false;
        boolean actualResult=PrimeNumber.checkPrimeNumber(nonPrimeNum);
        assertEquals(expectResult,actualResult);
    }
}
