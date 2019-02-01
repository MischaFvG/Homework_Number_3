package com.katzen;

import java.util.Arrays;

public class IntArrayList implements IntList {
    private int[] array = new int[1];
    private int count = 0;
    private static final int NUMBER_1 = 3;
    private static final int NUMBER_2 = 2;

    @Override
    public void add(int value) {
        if (count == array.length - 1) {
            createNewArray(array.length * NUMBER_1 / NUMBER_2 + 1);
            array[count] = value;
            count++;
        } else {
            array[count] = value;
            count++;
        }
    }

    @Override
    public void add(int index, int value) {
        int[] newArray = new int[array.length * NUMBER_1 / NUMBER_2 + 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        for (int i = index; i < index + 1; i++) {
            newArray[i] = value;
        }
        for (int i = index + 1; i < array.length; i++) {
            newArray[i] = array[i - 1];
        }
        array = newArray;
    }

    @Override
    public void clear() {
        count = 0;
    }

    @Override
    public boolean contains(int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                System.out.println("Array contains " + value);
                return true;
            }
        }
        System.out.println("Array does not contain " + value);
        return false;
    }

    @Override
    public int get(int index) {
        return array[index];
    }

    @Override
    public boolean isEmpty() {
        if (count == 0) {
            System.out.println("Array is empty");
            return true;
        }
        System.out.println("Array is not empty");
        return false;
    }

    @Override
    public void remove(int index) {
        for (int i = index; i < count; i++) {
            array[i] = array[i + 1];
            array[count] = 0;
            count--;
        }
    }

    @Override
    public void set(int index, int element) {
        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                System.out.println("ERROR!!! Your index is uncorrected");
                return;
            } else {
                array[index] = element;
            }
        }
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public String toString() {
        return "IntArrayList{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    private void createNewArray(int newArrayLength) {
        int[] newArray = new int[newArrayLength];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }
}
