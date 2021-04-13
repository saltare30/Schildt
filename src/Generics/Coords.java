package Generics;

public class Coords<T extends TwoD> {
    T[] coords;
    public Coords(T[] ob){
        coords = ob;
    }
}
