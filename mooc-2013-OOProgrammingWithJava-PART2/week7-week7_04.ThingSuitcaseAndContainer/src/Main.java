
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
        System.out.println();
        printLine();    // -------------------------------------

        Container container2 = new Container(1000);
        addSuitcasesFullOfBricks(container2);
        System.out.println(container2);
        System.out.println("yoooo");

    }

    public static void addSuitcasesFullOfBricks(Container container) {
        // adding 100 suitcases with one brick in each
        int m = 4;
        Suitcase suitcaseOfBricks = new Suitcase(100);
        Thing brick = new Thing("Brick", m);
        suitcaseOfBricks.addThing(brick);
        int i = 0;
        while (i < 100) {
            container.addSuitcase(new Suitcase(100));
            i++;
        }

        m++;

        for (Suitcase x : container.container) {
            if (container.totalContainerWeight() <= container.maximumMass) {
                suitcaseOfBricks.addThing(new Thing("Brick", m));
                m++;
            }
        }


    }

    static void printLine() {
        System.out.println("--------------------------------------------");
    }

}