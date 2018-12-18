import java.util.Random;

public class NightSky {

    private double  density;
    private int     width;
    private int     height;
    private int     starsInLastPrint;

    public NightSky(double density) {
        this.density = density;
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

    public void print() {
        starsInLastPrint = 0;
        for (int k = 0; k < this.height; k++) {
            printLine();
        }
    }

    public void printLine() {
        for (int i = 0; i < this.width; i++) {
            Random rand = new Random();
            // if density = 1, then 100% chance to print star
            if (this.density == 1) {
                System.out.print("*");
                starsInLastPrint++;
            } else {
                // nextDouble() returns 0-1.  Let density affect output.
                if (rand.nextDouble() <= density) {
                    System.out.print("*");
                    starsInLastPrint++;
                } else {
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
    }

    public int starsInLastPrint() {
        return starsInLastPrint;
    }

}
