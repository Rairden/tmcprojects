package boxes;

import java.util.ArrayList;
import java.util.List;

public class MaxWeightBox extends Box {

    private int maxWeight;
    private List<Thing> boxOfThings;

    public MaxWeightBox() {
        this.boxOfThings = new ArrayList<Thing>();
    }

    public MaxWeightBox(int maxWeight) {
        this();
        this.maxWeight = maxWeight;
    }

    @Override
    public void add(Thing thing) {
        int weightBox = 0;
        for (Thing t : boxOfThings) {
            weightBox += t.getWeight();
        }
        if (weightBox + thing.getWeight() <= maxWeight) {
            boxOfThings.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return boxOfThings.contains(thing);
    }
}
