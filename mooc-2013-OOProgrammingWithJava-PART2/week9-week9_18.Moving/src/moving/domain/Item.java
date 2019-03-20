package moving.domain;

public class Item implements Thing {

    private String name;
    private int volume;

    public Item(String name, int volume) {
        this.name   = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return name + " (" + volume + " dm^3)";
    }
}