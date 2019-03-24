package application;

public class Main {


    public static void main(String[] args) {
        ConstantSensor ten       = new ConstantSensor(10);
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

        Sensor therm4 = new Thermometer();
        Sensor therm5 = new Thermometer();
        Sensor therm6 = new Thermometer();

        AverageSensor KansasCity = new AverageSensor();
        KansasCity.addSensor(therm4);
        KansasCity.addSensor(therm5);
        KansasCity.addSensor(therm6);

        KansasCity.on();
        System.out.println("the temperature in KansasCity area is " + KansasCity.measure() + " degrees");
        System.out.println("the temperature in KansasCity area is " + KansasCity.measure() + " degrees");
        System.out.println("the temperature in KansasCity area is " + KansasCity.measure() + " degrees");

        System.out.println("readings: " + KansasCity.readings());
        printLine();

        KansasCity.addSensor(new ConstantSensor(30));
        KansasCity.off();
        System.out.println("the temperature in KansasCity area is " + KansasCity.readings() + " degrees");
        printLine();

        AverageSensor Orlando = new AverageSensor();
        //Orlando.measure();    // Orland is empty, will throw exception
        Orlando.addSensor(ten);
        Orlando.addSensor(minusFive);
        Orlando.measure();
        System.out.println("readings: " + Orlando.readings());
        System.out.println("the temperature in Orlando area is " + Orlando.readings() + " degrees");


    }

    private static void printLine() {
        System.out.println("--------------------------------------------");
    }
}
