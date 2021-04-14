package lambda;

public class HighTemp {
    private int hTemp;
    public HighTemp(int ht){
        hTemp = ht;
    }

    public boolean SameTemp(HighTemp ht2){
        return hTemp == ht2.hTemp;
    }

    public boolean lessThanTemp(HighTemp ht2){
        return hTemp < ht2.hTemp;
    }


}
