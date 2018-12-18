
public class Main {

    public static void main(String[] args) {

        NightSky nightSky = new NightSky(0.1, 40, 10);
        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
        System.out.println("");

        nightSky = new NightSky(0.2, 15, 6);
        nightSky.printLine();

        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());

    }
}
