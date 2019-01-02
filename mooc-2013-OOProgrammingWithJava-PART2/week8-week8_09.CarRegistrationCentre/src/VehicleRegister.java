import java.util.HashMap;

public class VehicleRegister {

    public HashMap<RegistrationPlate, String> db;

    public VehicleRegister() {
        this.db = new HashMap<RegistrationPlate, String>();
    }

    public String get(RegistrationPlate plate) {
        return plate.toString();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (!this.db.containsKey(plate)) {
            this.db.put(plate, owner);
            return true;
        } else {
            return false;
        }
    }

    public boolean delete(RegistrationPlate plate) {
        return false;
    }





}