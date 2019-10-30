package com.algorithms;
import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
        int[] inputArray = {7, 5, 2, 4, 1, 6, 3, 0};
        selectSort(inputArray);
        System.out.println(Arrays.toString(inputArray));
    }

    public static void selectSort(int inputArray[]) {
        int n = inputArray.length;
        for (int i = 0; i < n - 1; i++) {
            int minimumIndex = i;
            for (int j = i + 1; j < n; j++)
                if (inputArray[j] < inputArray[minimumIndex])
                    minimumIndex = j;
            int temp = inputArray[minimumIndex];
            inputArray[minimumIndex] = inputArray[i];
            inputArray[i] = temp;
        }
    }
}
