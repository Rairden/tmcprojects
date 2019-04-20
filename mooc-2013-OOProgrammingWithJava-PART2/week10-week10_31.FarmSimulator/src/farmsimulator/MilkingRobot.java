package farmsimulator;

public class MilkingRobot {

    private BulkTank connected;

    public MilkingRobot() {
    }

    // returns the connected bulk tank, or a null reference, if the tank hasn't been installed
    public BulkTank getBulkTank() {
        if (connected == null) {
            return null;
        }
        return connected;
    }

    // installs the parameter bulk tank to the milking robot
    public void setBulkTank(BulkTank connected) {
        this.connected = connected;
    }

    public void  milk(Milkable milkable) {
        if (connected == null) {
        throw new IllegalStateException("The MilkingRobot hasn't been installed");
        }
        connected.addToTank(milkable.milk());
    }
}
