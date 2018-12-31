import java.util.Scanner;

public class UserInterface {

    private Scanner  scan;
    private Airplane plane;
    private Flight   flight;

    public UserInterface(Scanner scan, Airplane plane, Flight flight) {
        this.scan   = scan;
        this.plane  = plane;
        this.flight = flight;
    }

    public void start() {
        System.out.println("Airport panel");
        System.out.println("--------------------\n");

        while (true) {
            panel();
            String cmd = scan.nextLine();

            if (cmd.equals("x") || cmd.equals("")) {
                flightService();
                return;
            }
            int command = Integer.parseInt(cmd);

            switch (command) {
                case 1:
                    addAirplane();
                    break;
                case 2:
                    addFlight();
                    break;
                default:
                    break;
            }
        }
    }

    public void flightService() {
        System.out.println();
        System.out.println( "Flight service\n" +
                            "------------\n");

        while (true) {
            flightServicePanel();
            String cmd = scan.nextLine();

            if (cmd.equals("x") || cmd.equals("")) {
                return;
            }
            int command = Integer.parseInt(cmd);

            switch (command) {
                case 1:
                    printPlanes();
                    break;
                case 2:
                    flight.printFlights();
                    break;
                case 3:
                    printPlaneInfo();
                    break;
                default:
                    break;
            }
        }
    }

    public void flightServicePanel() {
        System.out.print(   "Choose operation:\n" +
                            "[1] Print planes\n" +
                            "[2] Print flights\n" +
                            "[3] Print plane info\n" +
                            "[x] Quit\n" +
                            "> ");
    }

    public void panel() {
        System.out.print(   "Choose operation:\n" +
                            "[1] Add airplane\n" +
                            "[2] Add flight\n" +
                            "[x] Exit\n" +
                            "> ");
    }

    public void addAirplane() {
        System.out.print("Give plane ID: ");
        String planeID = scan.nextLine();

        System.out.print("Give plane capacity: ");
        int capacity = Integer.parseInt(scan.nextLine());

        plane.add(planeID, capacity);
    }

    public void addFlight() {
        System.out.print("Give plane ID: ");
        String planeID = scan.nextLine();

        System.out.print("Give departure airport code: ");
        String deptCode = scan.nextLine();

        System.out.print("Give destination airport code: ");
        String destCode = scan.nextLine();

        flight.addNewFlight(planeID, deptCode, destCode);
    }

    public void printPlanes() {
        for (String key : plane.planeToCapacity.keySet()) {
            System.out.println(key + " (" + plane.translate(key) + " ppl)");
        }
    }

    public void printPlaneInfo() {
        System.out.print("Give plane ID: ");
        String planeID = scan.nextLine();

        if (plane.planeToCapacity.containsKey(planeID)) {
            System.out.println(planeID + " (" + plane.planeToCapacity.get(planeID) + " ppl)\n");
        }
    }
}