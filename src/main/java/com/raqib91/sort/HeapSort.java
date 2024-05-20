package com.raqib91.sort;

public class HeapSort implements SortingAlgo {
    @Override
    public void sort(int[] a) {
        int n = a.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(a, n, i);

        for (int i = n - 1; i > 0; i--) {
            swap(a, i, 0);
            heapify(a, i, 0);
        }
    }

    private void heapify(int[] a, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && a[left] > a[largest])
            largest = left;
        if (right < n && a[right] > a[largest])
            largest = right;

        if (largest != i) {
            swap(a, largest, i);
            heapify(a, n, largest);
        }
    }

    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
