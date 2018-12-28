import java.util.ArrayList;
import java.util.HashMap;

public class Flight {

    private HashMap<String, Flight> planeToFlight;
    public Airplane plane;
    public String departure;
    public String destination;

    Flight(Airplane airplane, String departure, String destination) {
        this.planeToFlight = new HashMap<String, Flight>();
        this.plane = airplane;
        this.departure = departure;
        this.destination = destination;
    }

    public void addF(String planeID, String departure, String destination) {
        ArrayList<Flight> test = new ArrayList<Flight>();

        for (String i : this.planeToFlight.keySet()){
            test.add(i + " = " + this.planeToFlight.get(departure)));
        }


    }



}