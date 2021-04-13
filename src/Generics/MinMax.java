package Generics;

public interface MinMax<T extends Comparable<T>> {
    public T min();
    public T max();
}
