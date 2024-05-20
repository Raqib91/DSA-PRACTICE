package com.raqib91.search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int index = search(a, 5);
        if (index == -1)
            System.out.println("Not found");
        else
            System.out.println("Found at position " + index);
    }

    private static int search(int[] a, int k) {
        int n = a.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == k)
                return mid;
            else if (k > a[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }
}
