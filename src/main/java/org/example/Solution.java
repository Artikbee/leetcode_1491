package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {
    public double average(int[] salary) {

        int max = Arrays.stream(salary).max().getAsInt();
        int min = Arrays.stream(salary).min().getAsInt();

        int sum = 0;
        int count = 0;

        for (int j : salary) {
            if (j != max && j != min) {
                sum = sum + j;
                count++;
            }
        }

        return (double) sum/count;
    }
}
