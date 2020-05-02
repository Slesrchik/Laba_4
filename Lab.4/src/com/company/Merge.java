package com.company;

public class Merge {
    private static void merge(int[] numbers, int first, int n1, int n2){
        int[] temp = new int[n1+n2];
        int copied = 0, copied1 = 0, copied2 = 0;
        while((copied1 < n1) && (copied2 < n2)){
            if (numbers[first + copied1] < numbers[first + n1 + copied2])
                temp[copied++] = numbers[first + copied1++];
            else
                temp[copied++] = numbers[first + n1 + copied2++];
        }

        while(copied1 < n1)
            temp[copied++] = numbers[first + copied1++];
        while(copied2 < n2)
            temp[copied++] = numbers[first + n1 +copied2++];

        for(int i = 0; i < n1+n2; i++)
            numbers[first + i] = temp[i];
    }

    public static void mergeSort(int[] numbers, int first, int last){
        int n1, n2;
        if (last > 1){
            n1 = last/2;
            n2 = last - n1;

            mergeSort(numbers, first, n1);
            mergeSort(numbers, first + n1, n2);

            merge(numbers, first, n1, n2);
        }
    }
}
