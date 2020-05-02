package com.company;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        //  Scanner in = new Scanner(System.in);
        //  int n = in.nextInt();
//        for(int n=250000;n<=1000000;n+=50000) {
//            int[] arr = new int[n];
//            for (int i = 0; i < n; i++) {
//                arr[i] = (int) Math.random() + 10;
//
//            }

        //long time = System.currentTimeMillis();
        // CountingSort.countingSort(arr, n);
       // SelectionSort.sort(arr);
        // MergeSort.sort(arr, 0, n-1);
        // System.out.println("Amount:"+ n);
        // System.out.println(System.currentTimeMillis() - time);
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
        for (int n = 50000; n <= 1000000;n += 50000) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = (int) Math.random() + 10;
            }
                final int size = n;
                long time = timer(() -> {
                     CountingSort.countingSort(arr,size);
                  //  Merge.mergeSort(arr, 0, size - 1);
                }, TimeUnit.NANOSECONDS);
                System.out.println("Amount:"+size);
                System.out.println(time);


        }
    }

    private static long timer(Runnable method, TimeUnit timeUnit) {
        long time = System.nanoTime();
        method.run();
        time = System.nanoTime() - time;
        return TimeUnit.MILLISECONDS.convert(time, timeUnit);
    }
}





