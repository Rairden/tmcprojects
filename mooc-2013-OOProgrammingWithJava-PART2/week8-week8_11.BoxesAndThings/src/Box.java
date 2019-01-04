import java.util.ArrayList;

public class Box implements ToBeStored {

    private double maxWeight;
    private ArrayList<ToBeStored> things;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<ToBeStored>();
    }

    public void add(ToBeStored object) {
        if (weight() + object.weight() <= maxWeight) {
            things.add(object);
        }
    }

    public double weight() {
        double weight = 0;
        for (ToBeStored thing : things) {
            weight += thing.weight();
        }

        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + things.size() + " things, total weight " + weight() + " kg";
    }
}