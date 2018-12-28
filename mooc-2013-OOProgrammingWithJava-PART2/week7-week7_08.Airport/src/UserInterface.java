import java.util.Scanner;

public class UserInterface {

    private Scanner scan;
    private Airplane plane;
    private Flight flight;

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
            if (cmd.equals("x")) { return; }

            int command = Integer.parseInt(cmd);

            switch (command) {
                case 1:
                    addAirplane();
                    break;
                case 2:
                    addFlight();
                    break;
                case 3:
                    return;
            }

        }


    }

    public void panel() {
        System.out.print(  "Choose operation:\n" +
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
        Flight flight = new Flight(plane);
        System.out.print("Give planeID: ");
        String planeID = scan.nextLine();

        System.out.print("Give departure airport code: ");
        String deptCode = scan.nextLine();

        System.out.print("Give destination airport code: ");
        String destCode = scan.nextLine();



    }




}