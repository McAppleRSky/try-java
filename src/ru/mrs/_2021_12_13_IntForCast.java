package ru.mrs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.sort;

public class _2021_12_13_IntForCast {

    public static void main(String[] args) {
        {
            List<Integer> l = new ArrayList();
            for (int i : l);
        }
        {
            int[] a = new int[]{};
            for (int i : a);

            sort(a);
            int i = Arrays.binarySearch(a, 0);
        }
    }
}
