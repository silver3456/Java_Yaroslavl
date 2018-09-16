package _09_09_18.Assignment_2;

import _09_09_18.Assignment_1.CustomList;


public class CustomizedListImpl<E> implements CustomList<E> {

    Object[] arr;
    int size;


    public CustomizedListImpl(int initialCapacity) {
        arr = createArray(initialCapacity);
        size = 0;
    }

    @Override
    public E get(int index) throws IndexOutOfBoundsException {
        if (index > size) throw new ArrayIndexOutOfBoundsException("Array size is " + size +
                " and index is " + index);
        return (E) arr[index];

    }

    @Override
    public void set(int index, E number) {
        arr[index] = number;
    }

    @Override
    public void add(E number) {
        if (size == arr.length) {
            Object[] arr2 = createArray(arr.length * 2);
            System.arraycopy(arr, 0, arr2, 0, arr.length);
            arr = arr2;
        }
        arr[size] = number;
        size++;

    }

    private Object[] createArray(int size){
        return new Object[size];
    }

    @Override
    public int size() {
        return size;
    }
}