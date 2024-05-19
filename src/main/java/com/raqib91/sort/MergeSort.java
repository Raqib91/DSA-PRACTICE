package com.raqib91.sort;

public class MergeSort implements SortingAlgo {
    @Override
    public void sort(int[] a) {
        int n = a.length;
        int l = 0;
        int h = n - 1;
        mergeSort(a, l, h);
    }

    private void mergeSort(int[] a, int l, int h) {
        if (l < h) {
            int mid = (l + h) / 2;
            mergeSort(a, l, mid);
            mergeSort(a, mid + 1, h);

            merge(a, l, mid, h);
        }
    }

    private void merge(int[] a, int l, int mid, int h) {
        int m = mid - l + 1;
        int n = h - mid;

        int[] x = new int[m];
        int[] y = new int[n];

        int k = l;
        int i = 0;
        int j = 0;

        while (i < m)
            x[i++] = a[k++];

        while (j < n)
            y[j++] = a[k++];

        i = j = 0;
        k = l;

        while (i < m && j < n) {
            if (x[i] < y[j])
                a[k++] = x[i++];
            else
                a[k++] = y[j++];
        }

        while (i < m)
            a[k++] = x[i++];

        while (j < n)
            a[k++] = y[j++];
    }
}
