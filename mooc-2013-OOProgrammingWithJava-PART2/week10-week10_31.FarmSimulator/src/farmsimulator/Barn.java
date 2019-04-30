package farmsimulator;

import java.util.Collection;

public class Barn {

    private BulkTank tank;
    private MilkingRobot milkingRobot;

    public Barn(BulkTank tank) {
        this.tank = tank;
    }

    public BulkTank getBulkTank() {
        return this.tank;
    }

    // installs a milking robot and connects it to the barn bulk tank
    public void installMilkingRobot(MilkingRobot milkingRobot) {
        this.milkingRobot = milkingRobot;
        this.milkingRobot.setBulkTank(tank);
    }

    // milks the parameter cow with the help of the milking robot,
    // the method throws an IllegalStateException if the milking robot hasn't been installed
    public void takeCareOf(Cow cow) {
        if (milkingRobot == null) {
            throw new IllegalStateException("No milking robot installed.");
        } else {
            milkingRobot.milk(cow);
        }
    }

    public void takeCareOf(Collection<Cow> cows) {
        if (milkingRobot == null) {
            throw new IllegalStateException("No milking robot installed.");
        } else {
            for (Cow cow : cows) {
                cow.milk();
            }
        }
    }

    @Override
    public String toString() {
        return tank.toString();
    }
}
