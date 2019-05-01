package boxes;

import java.util.ArrayList;
import java.util.List;

public class OneThingBox extends Box {

    private List<Thing> oneThingBox;

    public OneThingBox() {
        this.oneThingBox = new ArrayList<>();
    }

    @Override
    public void add(Thing thing) {
        if (oneThingBox.isEmpty()) {
            oneThingBox.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return oneThingBox.contains(thing);
    }
}
