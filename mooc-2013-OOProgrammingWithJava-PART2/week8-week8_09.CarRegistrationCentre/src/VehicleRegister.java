import java.util.HashMap;

public class VehicleRegister {

    private HashMap<RegistrationPlate, String> db;

    public VehicleRegister() {
        this.db = new HashMap<RegistrationPlate, String>();
    }

    public String get(RegistrationPlate plate) {
        if (this.db.containsValue(plate)) {
            return db.get(plate);
        } else {
            return null;
        }
    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (!this.db.containsKey(plate)) {
            this.db.putIfAbsent(plate, owner);
            return true;
        } else {
            return false;
        }
    }

    // delete the info connected to the plate
    public boolean delete(RegistrationPlate plate) {
        if (this.db.containsKey(plate)) {
            if (this.db.containsValue(db.get(plate))) {
                this.db.remove(plate, db.get(plate));
                this.db.putIfAbsent(plate, null);
            }
            return true;
        } else {
            return false;
        }
    }





}