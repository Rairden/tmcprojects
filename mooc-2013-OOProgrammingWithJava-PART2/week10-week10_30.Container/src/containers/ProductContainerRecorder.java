package containers;

public class ProductContainerRecorder extends ProductContainer {

    private double initialVolume;
    private ContainerHistory containerHistory;

    public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
        super(productName, capacity);
        this.initialVolume = initialVolume;
    }

    @Override
    public String toString() {
        return containerHistory.toString();
    }
}
