package com.mariano.sandbox.datastructures;

import java.lang.invoke.SerializedLambda;

public interface LinkedList<T> {
    void add(T value);
    void add(int index, T value);
    T remove(int index);
    void remove(T value);
    T removeLast();
    void removeDuplicates();
    int size();
    T getKthToLastElement(int kth);
    LinkedList<T> partitionByValue(T value);

    LinkedList<T> reverse();
}
