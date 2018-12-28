Every week, you will find one or more larger exercises, where you can design freely the program structure, the appearance of the user interface and the requred commands are predefined. The first exercise which you can design freely in Advanced Programming is _Airport_.

**Attention: you can create only one Scanner object so that your tests would work well. Also, do not use static variables, the tests execute your program many different times, and the static variable values left from the previous execution would possibly disturb them!**

In the airport exercises we create an application to manage an airport, with its airplanes and flights. As far as the planes are concerned, we always know their ID and capacity. As for the flights, we know the plane used for the flight, the departure airport code (for instance [HEL](http://en.wikipedia.org/wiki/Helsinki_Airport)) and the destination airport code (for instance [BAL](http://en.wikipedia.org/wiki/Batman_Airport)).

There can be various different flights and planes. The same plane can also go on various different flights (various different routes). The application must offer two different panels. First, the airport worker inputs the flight and plane information to the system in the airport panel.

When the user exits the airport panel, the user then proceeds to use the flight service. The flight service has three actions: printing planes, printing flights, and printing airplane information. In addition to this, the user can exit the application by choosing `x`. If the user inputs an invalid command, the command is asked again.

<pre>
Airport panel
--------------------

Choose operation:
[1] Add airplane
[2] Add flight
[x] Exit
> <font color="red">1</font>
Give plane ID: <font color="red">HA-LOL</font>
Give plane capacity: <font color="red">42</font>
Choose operation:
[1] Add airplane
[2] Add flight
[x] Exit
> <font color="red">1</font>
Give plane ID: <font color="red">G-OWAC</font>
Give plane capacity: <font color="red">101</font>
Choose operation:
[1] Add airplane
[2] Add flight
[x] Exit
> <font color="red">2</font>
Give plane ID: <font color="red">HA-LOL</font>
Give departure airport code: <font color="red">HEL</font>
Give destination airport code: <font color="red">BAL</font>
Choose operation:
[1] Add airplane
[2] Add flight
[x] Exit
> <font color="red">2</font>
Give plane ID: <font color="red">G-OWAC</font>
Give departure airport code: <font color="red">JFK</font>
Give destination airport code: <font color="red">BAL</font>
Choose operation:
[1] Add airplane
[2] Add flight
[x] Exit
> <font color="red">2</font>
Give plane ID: <font color="red">HA-LOL</font>
Give departure airport code: <font color="red">BAL</font>
Give destination airport code: <font color="red">HEL</font>
Choose operation:
[1] Add airplane
[2] Add flight
[x] Exit
> <font color="red">x</font>

Flight service
------------

Choose operation:
[1] Print planes
[2] Print flights
[3] Print plane info
[x] Quit
> <font color="red">1</font>
G-OWAC (101 ppl)
HA-LOL (42 ppl)
Choose action:
[1] Print planes
[2] Print flights
[3] Print plane info
[x] Quit
> <font color="red">2</font>
HA-LOL (42 ppl) (HEL-BAL)
HA-LOL (42 ppl) (BAL-HEL)
G-OWAC (101 ppl) (JFK-BAL)

Choose operation:
[1] Print planes
[2] Print flights
[3] Print plane info
[x] Quit
> <font color="red">3</font>
Give plane ID: <font color="red">G-OWAC</font>
G-OWAC (101 ppl)

Choose operation:
[1] Print planes
[2] Print flights
[3] Print plane info
[x] Quit
> <font color="red">x</font>
</pre>

**Attention:** for the tests, it is essential that the _user interface_ works **exactly** as displayed above. In fact, it is a good idea to copy-paste the menus printed by the above program into your code _exactly_. The tests do not require that your program should be prepared to deal with invalid inputs. This exercise is worth three single excercise points.

_**The program must start by executing the main method in the exercise layout.**_

**Still another remark:** in order to make your tests work, your program has to create only one Scanner object. Also, avoid using static variables: the tests execute your program many different times, and the static variable values left from the previous execution would possibly disturb them!