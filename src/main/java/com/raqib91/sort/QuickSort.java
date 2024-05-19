package com.raqib91.sort;

public class QuickSort implements SortingAlgo {
    @Override
    public void sort(int[] a) {
        int n = a.length;
        int l = 0;
        int h = n - 1;
        quickSort(a, l, h);
    }

    private void quickSort(int[] a, int l, int h) {
        if (l < h) {
            int i = partition(a, l, h);
            quickSort(a, l, i - 1);
            quickSort(a, i + 1, h);
        }
    }

    private int partition(int[] a, int l, int h) {
        int pivot = a[h];
        int lp = l;
        int rp = h;

        while (lp < rp) {
            while (a[lp] <= pivot && lp < rp)
                lp++;
            while (a[rp] >= pivot && lp < rp)
                rp--;

            swap(a, lp, rp);
        }

        swap(a, lp, h);
        return lp;
    }

    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
