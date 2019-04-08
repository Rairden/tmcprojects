package movable;

import java.util.ArrayList;
import java.util.List;

public class Group implements Movable {

    private List<Movable> group;

    public Group() {
        this.group = new ArrayList<Movable>();
    }

    public void addToGroup(Movable movable) {
        group.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable m  : group) {
            m.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String output = "";

        for (Movable m : group) {
            output += m.toString() + "\n";
        }
        return output;
    }
}
