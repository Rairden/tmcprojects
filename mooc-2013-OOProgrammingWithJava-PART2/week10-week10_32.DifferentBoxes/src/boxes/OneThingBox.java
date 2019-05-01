package boxes;

public class OneThingBox extends Box {

    @Override
    public void add(Thing thing) {

    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }
}
