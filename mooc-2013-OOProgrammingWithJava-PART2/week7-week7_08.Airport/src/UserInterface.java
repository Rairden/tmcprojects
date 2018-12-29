import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Scanner scan;
    private Airplane plane;
    ArrayList<Flight> list = new ArrayList<Flight>();

    public UserInterface(Scanner scan, Airplane plane) {
        this.scan   = scan;
        this.plane  = plane;
    }

    public void start() {
        System.out.println("Airport panel");
        System.out.println("--------------------\n");

        while (true) {
            panel();
            String cmd = scan.nextLine();

            if (cmd.equals("x")) {
                flightService();
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
        System.out.println( "Flight service\n" +
                            "------------\n");

        while (true) {
            flightServicePanel();
            String cmd = scan.nextLine();

            if (cmd.equals("x")) {
                return;
            }
            int command = Integer.parseInt(cmd);

            switch (command) {
                case 1:
                    // do stuff
                    break;
                case 2:
                    // do stuff
                    break;
                case 3:
                    // do stuff
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
        System.out.print("Give planeID: ");
        String planeID = scan.nextLine();

        System.out.print("Give plane capacity: ");
        int capacity = Integer.parseInt(scan.nextLine());

        plane.add(planeID, capacity);
    }

    public void addFlight() {
        System.out.print("Give planeID: ");
        String planeID = scan.nextLine();

        System.out.print("Give departure airport code: ");
        String deptCode = scan.nextLine();

        System.out.print("Give destination airport code: ");
        String destCode = scan.nextLine();

        Flight flight = new Flight(plane);
        flight.addNewFlight(plane, deptCode, destCode);
        list.add(flight);

    }




}