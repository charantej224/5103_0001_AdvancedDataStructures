package com.algorithms;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] inputArray = {7, 5, 2, 4, 1, 6, 3, 0};
        bubbleSort(inputArray);
        System.out.println(Arrays.toString(inputArray));
    }
    static void bubbleSort(int inputArray[]) {
        int i, j, temp;
        for (i = 0; i < inputArray.length - 1; i++) {
            for (j = 0; j < inputArray.length - i - 1; j++) {
                if (inputArray[j] > inputArray[j + 1]) {
                    temp = inputArray[j];
                    inputArray[j] = inputArray[j + 1];
                    inputArray[j + 1] = temp;
                }
            }
        }
    }

}
