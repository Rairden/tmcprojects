package farmsimulator;

import java.util.LinkedList;

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
        printLine();    // ------------------

        Cow cow2 = new Cow();
        System.out.println(cow2);

        Alive livingCow = cow2;
        livingCow.liveHour();
        livingCow.liveHour();
        livingCow.liveHour();
        livingCow.liveHour();

        System.out.println(cow2);

        Milkable milkingCow = cow2;
        milkingCow.milk();

        System.out.println(cow2);
        System.out.println("");

        cow2 = new Cow("Ammu");
        System.out.println(cow2);
        cow2.liveHour();
        cow2.liveHour();
        System.out.println(cow2);
        cow2.milk();
        System.out.println(cow2);
        printLine();    // ------------------

        MilkingRobot milkingRobot3 = new MilkingRobot();
        Cow cow3 = new Cow();
        //milkingRobot3.milk(cow3); connected = null    throws Exception

        MilkingRobot milkingRobot4 = new MilkingRobot();
        Cow cow4 = new Cow();
        System.out.println("");

        BulkTank tank4 = new BulkTank();
        milkingRobot4.setBulkTank(tank4);
        System.out.println("Bulk tank: " + tank4);

        for(int i = 0; i < 2; i++) {
            System.out.println(cow4);
            System.out.println("Living..");
            for(int j = 0; j < 5; j++) {
                cow4.liveHour();
            }
            System.out.println(cow4);

            System.out.println("Milking...");
            milkingRobot4.milk(cow4);
            System.out.println("Bulk tank: " + tank4);
            System.out.println("");
            printLine();    // ------------------

            Barn barn = new Barn(new BulkTank());
            System.out.println("Barn: " + barn);

            MilkingRobot robot = new MilkingRobot();
            barn.installMilkingRobot(robot);

            Cow ammu = new Cow();
            ammu.liveHour();
            ammu.liveHour();

            barn.takeCareOf(ammu);
            System.out.println("Barn: " + barn);

            LinkedList<Cow> cowList = new LinkedList();
            cowList.add(ammu);
            cowList.add(new Cow());

            for (Cow cow : cowList) {
                cow.milk();
            }

            barn.takeCareOf(cowList);
            System.out.println("Barn: " + barn);
            printLine();    // ------------------




        }


    }


    private static void printLine() {
        System.out.println("--------------------------------------------");
    }
}
