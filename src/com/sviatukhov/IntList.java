package com.sviatukhov;

import java.util.Arrays;

public class IntList {

    private int[] arr = new int[0];
    int[] arrayNew = new int[arr.length + 1];

    public void add(int value) {
        int[] arrayNew = new int[arr.length + 1];
        System.arraycopy(arr, 0, arrayNew, 0, arr.length);
        arrayNew[arrayNew.length - 1] = value;
        arr = arrayNew;
    }

    public int get(int index) {
        return arr[index];
    }

    public void set(int index, int value) {
        arr[index] = value;
    }

    public int size() {
        return arr.length;
    }

    @Override
    public String toString() {
        return "IntList{" +
                "arr=" + Arrays.toString(arr) +
                //", arrayNew=" + Arrays.toString(arrayNew) +
                '}';
    }
}
