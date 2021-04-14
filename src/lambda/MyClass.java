package lambda;

public class MyClass<T> {
    private T val;
    public MyClass(T v) {
        val = v;
    }



    public T getVal() {
        return val;
    }
}