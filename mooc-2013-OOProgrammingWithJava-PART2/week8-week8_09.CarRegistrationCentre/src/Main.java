import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // below is the same example program as in the assignment
        
        RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate reg2 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate reg3 = new RegistrationPlate("FI", "UXE-465");
        RegistrationPlate reg4 = new RegistrationPlate("D", "B WQ-431");

        List<RegistrationPlate> finnish = new ArrayList<RegistrationPlate>();
        finnish.add(reg1);
        finnish.add(reg2);

        RegistrationPlate newPlate = new RegistrationPlate("FI", "ABC-123");

        if (!finnish.contains(newPlate)) {
            finnish.add(newPlate);
        }

        System.out.println("Finnish: " + finnish);
        // if the equals method hasn't been overwritten, the same registration plate is repeated in the list

        Map<RegistrationPlate, String> owners = new HashMap<RegistrationPlate, String>();
        owners.put(reg1, "Arto");
        owners.put(reg3, "Jürgen");
        owners.put(reg4, "chad");
        owners.put(reg4, "chad2");

        System.out.println("owners:");
        System.out.println(owners.get(new RegistrationPlate("FI", "ABC-123")));
        System.out.println(owners.get(new RegistrationPlate("D", "B WQ-431")));
        // if the hashCode hasn't been overwritten, the owners are not found

        System.out.println("----------------------------------------");

        VehicleRegister vehicleRegister = new VehicleRegister();
        System.out.println(vehicleRegister.get(reg1));

        vehicleRegister.add(reg1, "Arto1");
        vehicleRegister.add(reg1, "test1");
        vehicleRegister.add(reg3, "erik3");
        vehicleRegister.add(reg3, "chad3");
        vehicleRegister.add(reg4, "erik4");
     // vehicleRegister.delete(reg3);

        vehicleRegister.printOwners();


    }
}