package application;

public class Main {


    public static void main(String[] args) {
        ConstantSensor ten = new ConstantSensor(10);
        ConstantSensor minusFive = new ConstantSensor(-5);

        System.out.println(ten.measure());
        System.out.println(minusFive.measure());

        System.out.println(ten.isOn());
        ten.off();
        System.out.println(ten.isOn());
        printLine();

        Sensor therm1 = new Thermometer();
        therm1.on();
        System.out.println("the temperature in Kumpula is " + therm1.measure() + " degrees");

        Sensor therm2 = new Thermometer();
        Sensor therm3 = new Thermometer();

        AverageSensor helsinkiArea = new AverageSensor();
        helsinkiArea.addSensor(therm1);
        helsinkiArea.addSensor(therm2);
        helsinkiArea.addSensor(therm3);

        helsinkiArea.on();
        System.out.println("the temperature in Helsinki area is " + helsinkiArea.measure() + " degrees");
        printLine();


    }

    private static void printLine() {
        System.out.println("--------------------------------------------");
    }
}
