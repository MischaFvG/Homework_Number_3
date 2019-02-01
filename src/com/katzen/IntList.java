package com.katzen;

public interface IntList {
    void add(int value);

    void add(int index, int value);

    void clear();

    boolean contains(int value);

    int get(int index);

    boolean isEmpty();

    void remove(int index);

    void set(int index, int element);

    int size();
}
