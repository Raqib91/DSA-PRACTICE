package com.raqib91.sort;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        int[] a = {5, 2, 1, 3, 4};
        System.out.println("Before sort: " + Arrays.toString(a));
        SortingAlgo sortingAlgo = new QuickSort();
        sortingAlgo.sort(a);
        System.out.println("After sort: " + Arrays.toString(a));
    }
}
