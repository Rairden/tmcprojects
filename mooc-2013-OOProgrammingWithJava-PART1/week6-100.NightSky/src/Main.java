
public class Main {

    public static void main(String[] args) {

        NightSky nightSky = new NightSky(.05, 300, 40);
        nightSky.print();
        System.out.println("Number of stars: " + nightSky.starsInLastPrint());
        System.out.println();

        NightSky sky = new NightSky(0.2, 15, 6);
        sky.printLine();

        sky.print();
        System.out.println("Number of stars: " + sky.starsInLastPrint());

    }
}
