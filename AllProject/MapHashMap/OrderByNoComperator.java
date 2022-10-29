package MapHashMap;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class OrderByNoComperator implements Comparator<Integer> {
    public OrderByNoComperator() {
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1-o2;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }



    @Override
    public Comparator<Integer> reversed() {
        return Comparator.super.reversed();
    }

    @Override
    public Comparator<Integer> thenComparing(Comparator<? super Integer> other) {
        return Comparator.super.thenComparing(other);
    }

    @Override
    public <U> Comparator<Integer> thenComparing(Function<? super Integer, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return Comparator.super.thenComparing(keyExtractor, keyComparator);
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<Integer> thenComparing(Function<? super Integer, ? extends U> keyExtractor) {
        return Comparator.super.thenComparing(keyExtractor);
    }

    @Override
    public Comparator<Integer> thenComparingInt(ToIntFunction<? super Integer> keyExtractor) {
        return Comparator.super.thenComparingInt(keyExtractor);
    }

    @Override
    public Comparator<Integer> thenComparingLong(ToLongFunction<? super Integer> keyExtractor) {
        return Comparator.super.thenComparingLong(keyExtractor);
    }

    @Override
    public Comparator<Integer> thenComparingDouble(ToDoubleFunction<? super Integer> keyExtractor) {
        return Comparator.super.thenComparingDouble(keyExtractor);
    }
}
