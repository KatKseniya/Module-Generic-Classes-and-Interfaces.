package task2;

import java.util.Comparator;

public class Main {

        public static void main(String[] args) {

            MyList<Mark<Number>> list = new MyArrayList<>();

            list.add(new Mark<>(5));
            list.add(new Mark<>(3));
            list.add(new Mark<>(4));
            list.add(new Mark<>(4));
            list.add(new Mark<>(4));
            list.add(3, new Mark<>(7));
            list.add(6, new Mark<>(1));

            System.out.println("list = " + list);

            list.sort();
            System.out.println("Sorted list = " + list);

            list.remove(2);
            System.out.println("Remove by index = " + list);

            Comparator<Mark> comp = new MyComparator();
            list.sort(comp);
            System.out.println("Sorted by comparator list = " + list);

            list.remove();
            System.out.println("Remove = " + list);
        }

    }

