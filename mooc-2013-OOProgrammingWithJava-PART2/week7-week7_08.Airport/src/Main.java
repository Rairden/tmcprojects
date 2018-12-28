import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Airplane plane   = new Airplane();
        Scanner scan     = new Scanner(System.in);
        UserInterface ui = new UserInterface(scan, plane);

        ui.start();



    }


}

/*

Airport panel
--------------------

Choose operation:
[1] Add airplane
[2] Add flight
[x] Exit
> 1
Give plane ID: HA-LOL
Give plane capacity: 42
Choose operation:
[1] Add airplane
[2] Add flight
[x] Exit
> 1
Give plane ID: G-OWAC
Give plane capacity: 101
Choose operation:
[1] Add airplane
[2] Add flight
[x] Exit
> 2
Give plane ID: HA-LOL
Give departure airport code: HEL
Give destination airport code: BAL
Choose operation:
[1] Add airplane
[2] Add flight
[x] Exit
> 2
Give plane ID: G-OWAC
Give departure airport code: JFK
Give destination airport code: BAL
Choose operation:
[1] Add airplane
[2] Add flight
[x] Exit
> 2
Give plane ID: HA-LOL
Give departure airport code: BAL
Give destination airport code: HEL
Choose operation:
[1] Add airplane
[2] Add flight
[x] Exit
> x

Flight service
------------

Choose operation:
[1] Print planes
[2] Print flights
[3] Print plane info
[x] Quit
> 1
G-OWAC (101 ppl)
HA-LOL (42 ppl)
Choose action:
[1] Print planes
[2] Print flights
[3] Print plane info
[x] Quit
> 2
HA-LOL (42 ppl) (HEL-BAL)
HA-LOL (42 ppl) (BAL-HEL)
G-OWAC (101 ppl) (JFK-BAL)

Choose operation:
[1] Print planes
[2] Print flights
[3] Print plane info
[x] Quit
> 3
Give plane ID: G-OWAC
G-OWAC (101 ppl)

Choose operation:
[1] Print planes
[2] Print flights
[3] Print plane info
[x] Quit
> x

*/
