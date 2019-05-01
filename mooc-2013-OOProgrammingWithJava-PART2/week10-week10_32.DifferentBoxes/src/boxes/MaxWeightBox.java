package boxes;

import java.util.ArrayList;
import java.util.List;

public class MaxWeightBox extends Box {

    private int maxWeight;
    private List<Thing> maxWeightBox;

    public MaxWeightBox() {
        this.maxWeightBox = new ArrayList<>();
    }

    public MaxWeightBox(int maxWeight) {
        this();
        this.maxWeight = maxWeight;
    }

    @Override
    public void add(Thing thing) {
        for (Thing thing1 : maxWeightBox) {
            maxWeightBox.add(thing1);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }
}
