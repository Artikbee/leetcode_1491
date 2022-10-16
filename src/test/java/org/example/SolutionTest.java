package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void averageTest(){

        double result = solution.average(new int[]{8000,9000,2000,3000,6000,1000});

        Assertions.assertEquals(4750.000,result);
    }

}