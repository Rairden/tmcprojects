import java.util.Random;

public class NightSky {

    private double  density;
    private int     width;
    private int     height;
    private int     starsPrinted;

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
        for (int k = 0; k < this.height; k++) {
            printLine();
        }
    }

    public void printLine() {
            int i = 0;
            while (i < this.width) {
                Random rand = new Random();
                // if density = 1, then 100% chance to print star
                if (this.density == 1) {
                    System.out.print("*");
                    i++;
                }
                // nextDouble() returns 0-1.  Let density affect output.
                if (rand.nextDouble() <= density) {
                    System.out.print("*");
                    i++;
                    starsPrinted++;
                } else {
                    System.out.print(" ");
                    i++;
                }
            }
            System.out.println();
    }

    public int starsInLastPrint() {
        return starsPrinted;
    }

}
