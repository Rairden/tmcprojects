package farmsimulator;

public class BulkTank {

    private double capacity;
    private double volume;

    public BulkTank() {
        this(2000);
    }

    public BulkTank(double capacity) {
        this.capacity   = capacity;
        this.volume     = 0;
    }

    /**
     * You don't have to worry about a situation where the milk spills over
     * @param amount adds to the tank only as much milk as it fits; the additional milk will not be added
     */
    public void addToTank(double amount) {
        if (volume + amount >= capacity) {
            volume = capacity;
        } else {
            volume += amount;
        }
    }

    /**
     * @param amount takes the required amount from the tank, or as much as there is left
     * @return the amount taken from the tank
     */
    public double getFromTank(double amount) {
        double initialVolume = getVolume();
        if (volume - amount >= 0) {
            volume -= amount;
            return amount;
        } else {
            volume = 0;
            return initialVolume;
        }
    }

    public double howMuchFreeSpace() {
        return getCapacity() - getVolume();
    }

    public double getVolume() {
        return volume;
    }

    public double getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return Math.ceil(this.volume) + "/" + Math.ceil(this.capacity);
    }

}
