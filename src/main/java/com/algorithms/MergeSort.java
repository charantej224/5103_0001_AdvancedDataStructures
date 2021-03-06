package com.algorithms;

import java.util.Arrays;

public class MergeSort {
    static MergeSort mergeSort = new MergeSort();

    public static void main(String[] args) {
        int[] inputArray = {7, 5, 2, 4, 1, 6, 3, 0};
        mergeSort.sort(inputArray);
    }

    private void sort(int[] init) {

        auxSort(init, 0, init.length - 1);
        shuffle(init, 0, init.length - 1);
        System.out.println(Arrays.toString(init));
    }

    private void auxSort(int[] init, int low, int high) {
        int mid = (low + high) / 2;
        if (low < mid) {
            auxSort(init, low, mid);
            shuffle(init, low, mid);
        } else if (mid < high) {
            auxSort(init, mid + 1, high);
            shuffle(init, mid + 1, high);
        }
    }

    private void shuffle(int[] init, int lower, int upper) {
        int temp = 0;
        for (int i = lower; i <= upper; i++) {
            for (int j = i + 1; j <= upper; j++) {
                if (init[i] > init[j]) {
                    temp = init[j];
                    init[j] = init[i];
                    init[i] = temp;
                }
            }
        }
    }

}