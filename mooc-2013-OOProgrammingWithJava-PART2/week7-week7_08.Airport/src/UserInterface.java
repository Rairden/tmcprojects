import java.util.Scanner;

public class UserInterface {

    private Scanner scan;
    private Airplane plane;

    public UserInterface(Scanner scan, Airplane plane) {
        this.scan = scan;
        this.plane = plane;
    }

    public void start() {
        panel();

        while (true) {
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
        System.out.println("Airport panel");
        System.out.println("--------------------\n");
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
        int capacity = scan.nextInt();

        plane.add(planeID, capacity);
    }

    public void addFlight() {

    }
















}