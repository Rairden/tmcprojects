
public class Main {

    public static void main(String[] args) {
        Thing book   = new Thing("Happiness in Three Steps", 2);
        Thing mobile = new Thing("Nokia 3210", 1);
        Thing brick  = new Thing("Brick", 4);

        System.out.println("Book name: " + book.getName());
        System.out.println("Book weight: " + book.getWeight());

        System.out.println("Book: " + book);
        System.out.println("Mobile: " + mobile);
        printLine();    // -------------------------------------

        Suitcase suitcase = new Suitcase(5);
        System.out.println(suitcase);

        suitcase.addThing(book);
        System.out.println(suitcase);

        suitcase.addThing(mobile);
        System.out.println(suitcase);

        suitcase.addThing(brick);
        System.out.println(suitcase);
        printLine();    // -------------------------------------

        Suitcase suitcase2 = new Suitcase(10);
        suitcase2.addThing(book);
        suitcase2.addThing(mobile);
        suitcase2.addThing(brick);

        System.out.println("Your suitcase contains the following things:");
        suitcase2.printThings();
        System.out.println("Total weight: " + suitcase2.totalWeight() + " kg");
        printLine();    // -------------------------------------

        Thing heaviest = suitcase2.heaviestThing();
        System.out.println("The heaviest thing: " + heaviest);
        printLine();    // -------------------------------------

        Suitcase tomsCase = new Suitcase(10);
        tomsCase.addThing(book);
        tomsCase.addThing(mobile);

        Suitcase georgesCase = new Suitcase(10);
        georgesCase.addThing(brick);

        Container container = new Container(1000);
        container.addSuitcase(tomsCase);
        container.addSuitcase(georgesCase);

        System.out.println(container);
        printLine();    // -------------------------------------

        container.printThings();
        printLine();    // -------------------------------------

        Container container2 = new Container(1000);
        addSuitcasesFullOfBricks(container2);
        System.out.println(container2);

    }

    public static void addSuitcasesFullOfBricks(Container container) {
        // adding 100 suitcases with one brick in each
        for (int i = 1; i <= 100; i++) {
            Thing t = new Thing("Brick", i);
            Suitcase s = new Suitcase(100);

            s.addThing(t);
            container.addSuitcase(s);
        }
    }

    static void printLine() {
        System.out.println("--------------------------------------------");
    }

}

/*
        Book name: Happiness in Three Steps
        Book weight: 2
        Book: Happiness in Three Steps (2 kg)
        Mobile: Nokia 3210 (1 kg)
        --------------------------------------------
        empty 	 (0 kg)
        1 thing  (2 kg)
        2 things (3 kg)
        2 things (3 kg)
        --------------------------------------------
        Your suitcase contains the following things:
        Happiness in Three Steps (2 kg)
        Nokia 3210 (1 kg)
        Brick (4 kg)
        Total weight: 7 kg
        --------------------------------------------
        The heaviest thing: Brick (4 kg)
        --------------------------------------------
        2 suitcases (7 kg)
        --------------------------------------------
        Happiness in Three Steps (2 kg)
        Nokia 3210 (1 kg)
        Brick (4 kg)
        --------------------------------------------
        44 suitcases (990 kg)
*/