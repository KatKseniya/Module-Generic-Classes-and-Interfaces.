package task2;

import java.util.Comparator;

public class MyComparator<T extends Mark<?>> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        Mark<?> ob1 = o1;
        Mark<?> ob2 = o2;
        return -1 * (int)(ob1.getMark().doubleValue() - ob2.getMark().doubleValue());
    }

}
