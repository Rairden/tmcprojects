import java.util.ArrayList;

public class Changer {

    ArrayList<Change> list = new ArrayList<Change>();

    public Changer() {}

    public void addChange(Change change) {
        list.add(change);
    }

    public String change(String characterString) {
        for (Change x : list) {
            characterString = x.change(characterString);
        }
        return characterString;
    }

}