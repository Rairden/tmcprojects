package containers;

public class ProductContainerRecorder extends ProductContainer {

    private ContainerHistory containerHistory;

    public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
        super(productName, capacity);
        super.addToTheContainer(initialVolume);
        containerHistory = new ContainerHistory();
        containerHistory.add(initialVolume);
    }

    @Override
    public void addToTheContainer(double amount) {
        super.addToTheContainer(amount);
        containerHistory.add(super.getVolume());
    }

    @Override
    public double takeFromTheContainer(double amount) {
        double prevVolume = this.getVolume();
        super.takeFromTheContainer(amount);
        containerHistory.add(this.getVolume());

        return prevVolume - this.getVolume();
    }

    public String history() {
        return containerHistory.toString();
    }
}
