package Generics;

public class Gen<T> {
    T obT;
    void set(T t){
        obT = t;
    }
    void get(){
        System.out.println(obT);
    }
}
