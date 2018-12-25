import java.util.ArrayList;

public class Container {

    private ArrayList<Suitcase> container = new ArrayList<Suitcase>();
    private int maximumMass;

    public Container(int maximumMass) {
        this.maximumMass = maximumMass;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() + totalContainerWeight() <= maximumMass) {
            container.add(suitcase);
        }
    }

    public int totalContainerWeight() {
        int totalWeight = 0;
        for (Suitcase x : container) {
            totalWeight += x.totalWeight();
        }
        return totalWeight;
    }

    public void printThings() {
        for (Suitcase x : container) {
            x.printThings();
        }
    }

    public String toString() {
        // "0 suitcases" or "1 suitcases" is not proper English
        switch (container.size()) {
            case 0:
                return "empty \t (0 kg)";
            case 1:
                return "1 suitcase  ("  + totalContainerWeight() + " kg)";
            default:
                return container.size() + " suitcases (" + totalContainerWeight() + " kg)";
        }
    }


}