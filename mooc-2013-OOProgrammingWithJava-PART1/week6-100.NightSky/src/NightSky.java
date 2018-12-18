import java.util.Random;

public class NightSky {

    private double  density;
    private int     width;
    private int     height;

    public NightSky() {
        this.density = 0.1;
    }

    public NightSky(double density) {
        this.density = 0.1;
        this.width   = 20;
        this.height  = 10;
    }

    public NightSky(int width, int height) {
        this.density = 0.1;
        this.width   = width;
        this.height  = height;
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width   = width;
        this.height  = height;
    }

    public static void print() {

    }

    public void printLine() {
        for (int k = 0; k < this.height; k++) {

            int i = 0;
            while (i < this.width) {
                // nextDouble() returns 0-1.  Let density affect output.
                Random rand = new Random();

                if (rand.nextDouble() <= density) {
                    System.out.print(i);
                    i++;
                } else {
                    System.out.print(" ");
                    i++;
                }
            }
            System.out.println();
        }
    }

    public static int starsInLastPrint() {

        return 0;
    }

}
