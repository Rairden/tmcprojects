import java.util.ArrayList;

public class Flight {

    public Airplane plane;
    public String   planeID;
    public String   departure;
    public String   destination;
    public ArrayList<Flight> list = new ArrayList<Flight>();

    public Flight() {}

    public Flight(Airplane plane) {
        this.plane = plane;
    }

    public Flight(String planeID, String departure, String destination) {
        this.planeID = planeID;
        this.departure = departure;
        this.destination = destination;
    }

    public void addNewFlight(String planeID, String dept, String dest) {
        list.add(new Flight(planeID, dept, dest));
    }

    public void printFlights() {
        ArrayList<String> keySet = new ArrayList<String>();

        keySet.addAll(plane.getHashMap().keySet());

        for (String str : keySet) {
            for (Flight f : list) {
                if (f.planeID.equals(str)) {
                    System.out.println(f.planeID + " (" + plane.translate(f.planeID)
                    + " ppl) " + "(" + f.departure + "-" + f.destination + ")");
                }
            }
        }
        System.out.println();
    }
}