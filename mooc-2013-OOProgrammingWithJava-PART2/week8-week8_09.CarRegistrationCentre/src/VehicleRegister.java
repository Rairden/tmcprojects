import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class VehicleRegister {

    private HashMap<RegistrationPlate, String> db;

    public VehicleRegister() {
        this.db = new HashMap<RegistrationPlate, String>();
    }

    public String get(RegistrationPlate plate) {
        if (db.containsKey(plate)) {
            return db.get(plate);
        } else {
            return null;
        }
    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (!db.containsKey(plate)) {
            db.put(plate, owner);
            return true;
        } else {
            return false;
        }
    }

    // delete the info connected to the plate
    public boolean delete(RegistrationPlate plate) {
        if (db.containsKey(plate)) {
            if (db.containsValue(db.get(plate))) {
                db.remove(plate, db.get(plate));
                db.putIfAbsent(plate, null);
            }
            return true;
        } else {
            return false;
        }
    }

    public void printRegistrationPlates() {
        for (RegistrationPlate plate : db.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        Set<String> ownerSet = new HashSet<String>(db.values());

        for (String owner : ownerSet) {
            System.out.println(owner);
        }
    }

    // this works, but isn't as good.
    public void printOwners2() {
        ArrayList<String> temp = new ArrayList<String>();

        for (String owner : db.values()) {
            if (!temp.contains(owner)) {
                temp.add(owner);
                System.out.println(owner);
            }
        }
    }


}