package task2;

import java.util.Arrays;
import java.util.Comparator;


class MyArrayList<T> implements MyList<T> {

    public static final int DEFAULT_CAPACITY = 10;

    private Object[] myArrayList;
    private int size;

    public MyArrayList() {
        myArrayList = new Object[DEFAULT_CAPACITY];
    }

    @Override
    public void add(T ob) {
        if (size >= myArrayList.length) {
            myArrayList = Arrays.copyOf(myArrayList, myArrayList.length + DEFAULT_CAPACITY);
        }
        myArrayList[size] = ob;
        size++;
    }

    @Override
    public void add(int index, T ob) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        if (index == size) {
            myArrayList = Arrays.copyOf(myArrayList, myArrayList.length + 1);
        }
        int numMoved = myArrayList.length - index - 1;
        System.arraycopy(myArrayList, index, myArrayList, index + 1, numMoved);
        myArrayList[index] = ob;
        size++;
    }

    @Override
    public T remove() {
        return remove(size - 1);
    }

    @Override
    public T remove(int index) {
        T removedElement = (T) myArrayList[index];
        Object[] temp = myArrayList;
        myArrayList = new Object[temp.length - 1];
        System.arraycopy(temp, 0, myArrayList, 0, index);
        int numMoved = temp.length - index - 1;
        System.arraycopy(temp, index + 1, myArrayList, index, numMoved);
        size--;
        return removedElement;
    }

    @Override
    public void sort() {
        Arrays.sort(myArrayList, 0, size);
    }

    @Override
    public void sort(Comparator<? super T> comparator) {

        Arrays.sort((T[]) myArrayList, 0, size, comparator);
    }

    @Override
    public String toString() {
        String s = "[";
        for (int i = 0; i < size; i++) {
            s += myArrayList[i];
            if (i < size - 1) {
                s += ", ";
            }
        }
        s += "]";

        return "MyArrayList { size = " + size + ", list = " + s + "}";
    }
}

