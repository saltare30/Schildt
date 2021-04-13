import Generics.*;
public class SchildPro {
    static public <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y){
        for(int i=0; i<y.length;i++){
            if(x.equals(y[i])) return true;
        }
        return false;
    }

    static public void main(String[] args){

        Integer inums[] = {3, 6, 2, 8, 6 };
        Character chs [] = { 'b' , 'r' , 'p' , 'w' } ;

        MyClass<Integer> iob = new MyClass<>(inums);
        MyClass<Character> соЬ = new MyClass<>(chs);
        System.out.println(iob.min());
        System.out.println(iob.max());
        System.out.println(соЬ.min());
        System.out.println(соЬ.max());


        /*
        Integer in[] = {1,2,3,4,5,6,7,8,9,10};
        Double dob[] = {1.1,1.2,1.3,1.4,1.5,1.6,1.7,1.8,1.9,2.0};
        Stats<Integer> st1 = new Stats<Integer>(in);
        Stats<Double>  st2 = new Stats<Double>(dob);


        System.out.println(st1.average());
        System.out.println(st2.average());
        System.out.println(st1.sameAVF(st2));
        */

    }
}
