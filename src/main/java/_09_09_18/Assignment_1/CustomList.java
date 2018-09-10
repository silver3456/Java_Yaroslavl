package _09_09_18.Assignment_1;

public interface CustomList<E> {
    E get(int index);

    void set(int index, E number);

    void add(E number);

    int size();

}
