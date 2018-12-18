
public class Main {

    public static void main(String[] args) {

        NightSky nightSky = new NightSky(1, 40, 10);
        nightSky.print();
        System.out.println("Number of stars: " + nightSky.starsInLastPrint());
        System.out.println("");

        nightSky = new NightSky(0.2, 15, 6);
        nightSky.printLine();

        nightSky.print();
        System.out.println("Number of stars: " + nightSky.starsInLastPrint());

    }
}
