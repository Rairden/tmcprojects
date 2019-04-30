package farmsimulator;

import java.util.ArrayList;
import java.util.List;

public class Farm extends Barn implements Alive {

    private String owner;
    private Barn barn;
    private List<Cow> cowsInBarn;

    public Farm(String owner, Barn barn) {
        this.owner = owner;
        this.barn = barn;
        this.cowsInBarn = new ArrayList<Cow>();
    }

    public void installMilkingRobot(MilkingRobot milkingRobot) {
        barn.installMilkingRobot(milkingRobot);
    }

    public void manageCows() {
        barn.takeCareOf(cowsInBarn);
        for (Cow cow : cowsInBarn) {
            cow.milk();
        }
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public void liveHour() {
        for (Cow cow : cowsInBarn) {
            cow.liveHour();
        }
    }

    public void addCow(Cow cow) {
        cowsInBarn.add(cow);
    }

    public String cowListToString() {
        if (cowsInBarn.size() == 0) {
            return "No cows.";
        }

        String cows = "        ";
        for (Cow cow : cowsInBarn) {
            cows += cow.toString() + "\n        ";
        }
        return cows;
    }

    @Override
    public String toString() {
        return "Farm owner: " + owner + "\n"
                + "Barn bulk tank: " + barn.getBulkTank().toString() + "\n"
                + "Animals:\n" + cowListToString();
    }
}
