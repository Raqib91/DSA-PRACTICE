package com.raqib91.sort;

public class InsertionSort implements SortingAlgo {
    @Override
    public void sort(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int current = a[i];
            int j = i - 1;
            while (j >= 0 && current < a[j]) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = current;
        }
    }
}
