package farmsimulator;

public class Main {

    public static void main(String[] args) {

        BulkTank tank = new BulkTank();
        tank.getFromTank(100);
        tank.addToTank(25);
        tank.getFromTank(5);
        System.out.println(tank);

        tank = new BulkTank(50);
        tank.addToTank(100);
        System.out.println(tank);
        System.out.println("---------");

        Cow cow = new Cow();
        System.out.println(cow);

        Alive livingCow = cow;
        livingCow.liveHour();
        livingCow.liveHour();
        livingCow.liveHour();
        livingCow.liveHour();

        System.out.println(cow);

        Milkable milkingCow = cow;
        milkingCow.milk();

        System.out.println(cow);
        System.out.println("");

        cow = new Cow("Ammu");
        System.out.println(cow);
        cow.liveHour();
        cow.liveHour();
        System.out.println(cow);
        cow.milk();
        System.out.println(cow);
        System.out.println("---------");
    }
}
