package Generics;

public class BoundedWildcard {
    public static void showXY(Coords<?> c){
        System.out.println("Координаты Х и Y");
        for(int i = 0; i<c.coords.length; i++){
            System.out.println(c.coords[i].x + " " + c.coords[i].y);
        }
        System.out.println();
    }

    public static void showXYZ(Coords<? extends ThreeD> c){
        System.out.println("Координаты Х, Y и Z");
        for(int i = 0; i<c.coords.length; i++){
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z);
        }
        System.out.println();
    }

    static void showXYZT(Coords<? extends FourD> c){
        System.out.println("Координаты Х, Y, Z и T");
        for(int i = 0; i<c.coords.length; i++){
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z + " " + c.coords[i].t);
        }
        System.out.println();
    }



}
