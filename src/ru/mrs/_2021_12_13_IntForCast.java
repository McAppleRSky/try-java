package ru.mrs;

import java.util.ArrayList;
import java.util.List;

public class _2021_12_13_IntForCast {

    public static void main(String[] args) {
        {
            List<Integer> l = new ArrayList();
            for (int i : l);
        }
        {
            int[] a = new int[]{};
            for (int i : a);
        }
    }
}
