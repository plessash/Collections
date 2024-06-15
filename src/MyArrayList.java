import java.util.*;

import static java.util.Collections.list;
import static java.util.Collections.swap;

public class MyArrayList<T> {
    private T[] list;
    public T[] getList() {
        return list;
    }

    public int getSize() {
        return size;
    }

    private int size;

    public MyArrayList(T[] list, int size) {
        this.list = list;
        this.size = size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    private static final int DEFAULT_CAPACITY = 10;
    private static final int FACTOR = 2;

    public MyArrayList(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity <=0!");
        } else {
            list = (T[]) new Object[capacity];
        }
    }

    public MyArrayList() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    private void ensureList() {
        int newCapacity = list.length * FACTOR;
        T[] newList = (T[]) new Object[newCapacity];
        System.arraycopy(this.list, 0, newList, 0, list.length);
        this.list = newList;
    }

    public T get(int index) {
        return list[index];
    }

    public void addElement(T element) {
        if (size >= DEFAULT_CAPACITY) {
            ensureList();
        }
        list[size++] = element;
    }

    public void add(int index, T element) {
        if (list[index] == null) {
            list[index] = element;
            return;
        }
        if (size + 1 >= list.length) {
            ensureList();
        }
        System.arraycopy(list, index, list, index + 1, size - index);
        list[index] = element;
        size++;
    }

    public T remove(int index) {
        T element = list[index];
        System.arraycopy(list, index + 1, list, index, size - index - 1);
        size--;
        list[size] = null;
        return element;
    }

    public void addAll(MyArrayList<T> e) {
        for (int i = 0; i < e.size; i++) {
            this.addElement(e.get(i));
        }
    }

    public void removeAll() {
        for (int i = 0; i < list.length; i++) {
            list[i] = null;
        }
    }
    public T[] bubbleSort(Comparator<? super T> comparator) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 1; i < list.length; i++) {
                if (comparator.compare(list[i - 1], list[i]) > 0) {
                    T temp = list[i];
                    list[i] = list[i - 1];
                    list[i - 1] = temp;
                    swapped = true;
                }
            }
        }
        return list;
    }
    public void printDisplay() {
        for (T elem : list) {
            System.out.print(elem + " ");
        }
    }
}


