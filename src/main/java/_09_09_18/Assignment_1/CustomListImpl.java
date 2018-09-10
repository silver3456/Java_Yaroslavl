package _09_09_18.Assignment_1;

import _09_09_18.Assignment_1.CustomList;

public class CustomListImpl implements CustomList {

    int[] arr;
    int size;

    public CustomListImpl() {
        arr = new int[10];
        size = 0;

    }

    @Override
    public int get(int index) throws ArrayIndexOutOfBoundsException {
        if (index > size - 1) throw new ArrayIndexOutOfBoundsException("Array size is " + size +
                " and index is " + index);
        return arr[index];

    }

    @Override
    public void set(int index, int number) {
        arr[index] = number;

    }

    @Override
    public void add(int number) {
        if (size == arr.length) {
            int[] arr2 = new int[arr.length * 2];
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
