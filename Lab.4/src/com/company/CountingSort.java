package com.company;

public class CountingSort {
    public static void countingSort(int[] input, int k){
        int counter[] = new int[k + 1];
        for (int i : input) {
            counter[i]++;
        }

        int ndx = 0;
        for (int i = 0; i < counter.length; i++) {
            while (counter[i]> 0) {
                input[ndx++] = i;
                counter[i]--;

            }
        }

    }
}
