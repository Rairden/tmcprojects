public class Printing {

    public static void printStars(int amount) {
        while (amount > 0) {
            System.out.print("*");
            amount--;
        }
        System.out.println();
    }

    public static void printSquare(int sideSize) {
        for (int i = 0; i < sideSize; i++) {
            for (int j = 0; j < sideSize; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printRectangle(int width, int height) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printTriangle(int size) {
        for (int i = 0; i < size+1; i++) {
            printStars(i);
            System.out.println();
        }

    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first
        // here to see that the printout looks correct

        printStars(4);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
