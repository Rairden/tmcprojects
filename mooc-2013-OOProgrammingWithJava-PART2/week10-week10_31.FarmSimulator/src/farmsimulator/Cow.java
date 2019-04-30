package farmsimulator;

import java.util.Random;

public class Cow extends BulkTank implements Milkable, Alive {

    private String name;
    private double udderCapacity;
    private double milkAmount;

    private static final String[] NAMES = new String[] {
            "Anu", "Arpa", "Essi", "Heluna", "Hely",
            "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme",
            "Jaana", "Jami", "Jatta", "Laku", "Liekki",
            "Mainikki", "Mella", "Mimmi", "Naatti", "Ilo",
            "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
            "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    public Cow() {
        udderCapacity = 15 + new Random().nextInt(26);
        int rand = new Random().nextInt(NAMES.length -1);
        name = NAMES[rand];
    }

    public Cow(String name) {
        this();
        this.name = name;
    }

    public double getCapacity() {
        return udderCapacity;
    }

    // add between 0.7 to 2 Liters of milk every hour to the cow udder.
    @Override
    public void liveHour() {
        double amount = new Random().nextDouble() * 1.3 + 0.7;

        if (milkAmount + amount >= udderCapacity) {
            milkAmount = udderCapacity;
        } else {
            milkAmount += amount;
        }
    }

    @Override
    public double milk() {
        double milked = milkAmount;
        milkAmount = 0;
        return milked;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return milkAmount;
    }

    @Override
    public String toString() {
        return name + " " + Math.ceil(milkAmount) + "/" + Math.ceil(udderCapacity);
    }

}
