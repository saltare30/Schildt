import Generics.*;
import lambda.MyNumber;
import lambda.SomeFunc;
import lambda.StringFunc;

public class SchildPro {
    static public <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y){
        for(int i=0; i<y.length;i++){
            if(x.equals(y[i])) return true;
        }
        return false;
    }

    static public void main(String[] args){


        SomeFunc<Integer> ifunc = o -> 123;
        SomeFunc<String> sfunc = o -> "Это строка";
        SomeFunc<Double> dfunc = o -> {
            return o;
        };

        System.out.println(ifunc.func(1));
        System.out.println(sfunc.func(""));
        System.out.println(dfunc.func(1.3));


        /*
        StringFunc str = str1 -> {
            String temp = "";
            for (int i = str1.length()-1; i >= 0 ; i--) {
                temp+=str1.charAt(i);
            }
            return temp;
        };

        System.out.println(str.func("Привет"));



        MyNumber factorial = (n) -> {
            int result=1;
            for(int i = 1; i<=n; i++) result*=i;
            return result;
        };

        System.out.println("Факториал 1 = " + factorial.func(1));
        System.out.println("Факториал 2 = " + factorial.func(2));
        System.out.println("Факториал 3 = " + factorial.func(3));
        System.out.println("Факториал 4 = " + factorial.func(4));
        System.out.println("Факториал 5 = " + factorial.func(5));



 /*
        Gen<Integer> iOb    = new Gen<Integer>(88);
        Gen2<Integer> iOb2  = new Gen2<Integer>(99);
        Gen2<String> strOb2 = new Gen2<String>("Tecт обобщений");

        if(iOb2 instanceof Gen2<?>) System.out.println("Oбъeкт iOb2 является экземпляром класса Gen2");
        if(iOb2 instanceof Gen<?>)  System.out.println("Oбъeкт iOb2 является экземпляром класса Gen");
        System.out.println();


        // проверить, является ли strOb2 объектом класса Gen2
        if(strOb2 instanceof Gen2<?>) System.out.println("Oбъeкт strOb2 является экземпляром класса Gen2");
        // проверить, является ли strOb2 объектом класса Gen
        if(strOb2 instanceof Gen<?>) System.out.println("Oбъeкт strOb2 является экземпляром класса Gen");
        System.out.println();

        if(iOb instanceof Gen2<?>) System.out.println("Oбъeкт iOb является экземпляром класса Gen2");
        if(iOb instanceof Gen<?>) System.out.println("Oбъeкт iOb является экземпляром класса Gen");

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
