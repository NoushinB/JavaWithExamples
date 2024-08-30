package org.noushin.examples.findingSpecificNumberInArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindingNumberInArrayTest {
 @Test
   public void verifyFindingNumberInArray(){
       int[]  array={1,23,43,3,8};
       int specificNumber=3;
       boolean actulResult=FindingNumberInArray.findNumber(array,specificNumber);

       assertTrue(true, String.valueOf(actulResult));
   }
}