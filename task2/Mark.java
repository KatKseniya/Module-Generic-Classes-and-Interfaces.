package task2;

public class Mark<T extends Number> implements Comparable<Mark<T>> {
    public T mark;

    public Mark() {

    }

    public Mark(T mark) {
        this.mark = mark;
    }


    public T getMark() {
        return mark;
    }

    public void setMark(T mark) {
        this.mark = mark;
    }


    @Override
    public String toString() {
        return "(mark=" + mark + ")";
    }


    @Override
    public int compareTo(Mark<T> o) {
        double m1 = mark.doubleValue();
        double m2 = o.mark.doubleValue();
        return (int) (m1 - m2);
    }


}