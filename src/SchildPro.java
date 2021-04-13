public class SchildPro {
    static public void main(String[] args){
        Integer in[] = {1,2,3,4,5,6,7,8,9,10};
        Double dob[] = {1.1,1.2,1.3,1.4,1.5,1.6,1.7,1.8,1.9,2.0};
        Stats<Integer> st1 = new Stats<Integer>(in);
        Stats<Double>  st2 = new Stats<Double>(dob);


        System.out.println(st1.average());
        System.out.println(st2.average());
        System.out.println(st1.sameAVF(st2));


    }
}
