package _09_09_18.Assignment_2;

import _09_09_18.Assignment_1.CustomList;


public class CustomizedListImpl implements CustomList {

    Object[] arr;
    int size;


    public CustomizedListImpl(int initialCapacity) {
        arr = new Object[initialCapacity];
        size = 0;
    }

    @Override
    public Object get(int index) throws IndexOutOfBoundsException {
        if (index > size) throw new ArrayIndexOutOfBoundsException("Array size is " + size +
                " and index is " + index);
        return arr[index];

    }

    @Override
    public void set(int index, Object number) {
        arr[index] = number;
    }

    @Override
    public void add(Object number) {
        if (size == arr.length) {
            Object[] arr2 = new Object[arr.length * 2];
            System.arraycopy(arr, 0, arr2, 0, arr.length);
            arr = arr2;
        }
        arr[size] = number;
        size++;

    }

    @Override
    public int size() {
        return size;
    }
}