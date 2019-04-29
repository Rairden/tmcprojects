
public class Main {

    public static void main(String[] args) {

        if (args.length == 0) {
            NightSky sky = new NightSky(.05, 300, 40);
            sky.printNightSky(sky);
        } else if (args.length == 3) {
            double  x = Double.parseDouble(args[0]);
            int     y = Integer.parseInt(args[1]);
            int     z = Integer.parseInt(args[2]);
            NightSky sky = new NightSky(x, y, z);
            sky.printNightSky(sky);
        }

        NightSky sky = new NightSky(0.2, 15, 6);
        sky.printLine();

        sky.print();
        System.out.println("Number of stars: " + sky.starsInLastPrint());

    }
}
