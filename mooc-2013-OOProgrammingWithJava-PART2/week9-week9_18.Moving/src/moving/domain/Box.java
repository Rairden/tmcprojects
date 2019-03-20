package moving.domain;

import java.util.ArrayList;
import java.util.List;

public class Box implements Thing {

    private int maximumCapacity;
    private List<Thing> list;

    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.list = new ArrayList<Thing>();
    }

    public boolean addThing(Thing thing) {
        if (thing.getVolume() + getVolume() < maximumCapacity) {
            list.add(thing);
            return true;
        }
        return false;
    }

    @Override  // return the volume of items inside the box.
    public int getVolume() {
        int totalVolume = 0;

        for (Thing thing : list) {
            totalVolume += thing.getVolume();
        }
        return totalVolume;
    }
}