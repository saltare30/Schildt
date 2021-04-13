package Generics;

public class Gen<T> {
    T obT;
    public Gen(T t){
        obT = t;
    }
    T getOb(){
        return obT;
    }
}
