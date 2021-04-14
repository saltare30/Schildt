import Generics.*;
import lambda.*;
import lambda.MyClass;

import java.util.ArrayList;
import java.util.Collections;

public class SchildPro {
    static public <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y){
        for(int i=0; i<y.length;i++){
            if(x.equals(y[i]))
                return true;
        }
        return false;
    }

    static String stringOp(StringFunc sf, String s){
        return sf.func(s);
    }

    /*
    static <T> int counter(T[] vals, MyFunc<T> f, T v){
        int count = 0;
        for(int i=0; i < vals.length; i++)
            if(f.func(vals[i], v)) count++;
        return count;
    }

    static int compareMC(MyClass a, MyClass b) {
        return a.getVal() - b.getVal();
    }
*/


    static <R,T> R myClassFactory(MyFunc<R,T> cons, T v){
        return cons.func(v);
    }

    static public void main(String[] args){

        MyFunc<MyClass<Double>, Double> myClassCons = MyClass<Double>::new;;
        MyFunc<MyClass2, String> myClassCons2 = MyClass2::new;

        MyClass<Double> mc = myClassFactory(myClassCons, 100.1);
        System.out.println("Значение val в объекте mc равно " + mc.getVal());


        MyClass2 mc2 = myClassFactory(myClassCons2, "Лямбда");
        System.out.println("Значение str в объекте mc2 равно " + mc2.getVal());



       /*
        ArrayList<MyClass> al = new ArrayList<MyClass>();

        al.add(new MyClass(1));
        al.add(new MyClass(4));
        al.add(new MyClass(2));
        al.add(new MyClass(9));
        al.add(new MyClass(3));
        al.add(new MyClass(7));
        // найти максимальное значение, используя
        // метод compareMC()

        MyClass maxValObj = Collections.max(al, SchildPro::compareMC);

        System.out.println("Maкcимaльнoe значение равно: " + maxValObj.getVal());




        int count;
        // создать массив объектов типа HighTemp
        HighTemp[] weekDayHighs = {
                new HighTemp(89), new HighTemp(82),
                new HighTemp(90), new HighTemp(89),
                new HighTemp(89), new HighTemp(91),
                new HighTemp(84), new HighTemp(83)
        };

        HighTemp[] weekDayHighs2 = {
                new HighTemp(32), new HighTemp(12),
                new HighTemp(24), new HighTemp(19),
                new HighTemp(18), new HighTemp(12),
                new HighTemp(-1), new HighTemp(13)
        };



        // Использовать метод counter() вместе с массивами объектов типа HighTemp. Обратите внимание на то,
        // что ссылка на метод экземпляра SameTemp() передается в качестве второго параметра
        count = counter(weekDayHighs, HighTemp::SameTemp, new HighTemp(89));

        System.out.println("Дней, когда максимальная температура была 89: " + count);




        count = counter(weekDayHighs2, HighTemp::SameTemp, new HighTemp(12));
        System.out.println("Дней, когда максимальная температура была 12: " + count);

        // А теперь воспользоваться методом lessThanTemp(),
        // чтобы выяснить, сколько дней температура была меньше заданной
        count = counter(weekDayHighs, HighTemp::lessThanTemp,new HighTemp(89));
        System.out.println("Дней, когда максимальная температура была меньше 89: " + count);
        count = counter(weekDayHighs2, HighTemp::lessThanTemp, new HighTemp(19));
        System.out.println("Дней, когда максимальная температура была меньше 19: " + count);



        /*
        SomeFunc<Integer> ifunc = o -> 123;
        SomeFunc<String> sfunc = o -> "Это строка";
        SomeFunc<Double> dfunc = o -> {
            return o;
        };

        System.out.println(ifunc.func(1));
        System.out.println(sfunc.func(""));
        System.out.println(dfunc.func(1.3));

        StringFunc strf = (str)->str.toLowerCase();

        System.out.println(stringOp(strf,"ПРИВЕТ"));





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
