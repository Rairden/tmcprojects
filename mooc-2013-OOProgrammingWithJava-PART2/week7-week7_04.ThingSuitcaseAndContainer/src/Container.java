import java.util.ArrayList;

public class Container {

    public ArrayList<Suitcase> container = new ArrayList<>();
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
        int i = 0;
        for (Suitcase x : container) {
            System.out.println(x.things.get(i).getName() + " (" + x.things.get(i).getWeight() + " kg)");
            i++;
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
