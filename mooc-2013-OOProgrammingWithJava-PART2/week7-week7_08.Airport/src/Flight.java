
public class Flight {

    public Airplane plane;
    public String departure;
    public String destination;

    public Flight(Airplane plane) {
        this.plane = plane;
    }

    public void addNewFlight(Airplane plane, String dept, String dest) {
        this.plane       = plane;
        this.departure   = dept;
        this.destination = dest;
    }

    public Airplane getPlane() {
        return plane;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDestination() {
        return destination;
    }



}