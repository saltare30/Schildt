public class Stats<T extends Number> {
    T[] nums;
    Stats(T[] o){
        nums = o;
    }

    double average(){
        double sum = 0;
        for(T x:nums){
            sum+=x.doubleValue();
        }
        return sum/ nums.length;
    }

    boolean sameAVF(Stats<?> ob){
        if (average() == ob.average()) return true;

        return false;

    }
}
