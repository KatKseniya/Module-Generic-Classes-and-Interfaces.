package task2;

import java.util.Comparator;

public interface MyList <T> {
    void add (T ob);
    void add (int index, T ob);
    T remove();
    T remove (int index);
    void sort();
    void sort(Comparator<? super T> comp);
}
