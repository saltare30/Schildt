package Generics;

public class GenCons {
    private double val;
    public <T extends Number>GenCons(T arg){
        val = arg.doubleValue();
    }

    public void show(){
        System.out.println("val: " + val);
    }
}
