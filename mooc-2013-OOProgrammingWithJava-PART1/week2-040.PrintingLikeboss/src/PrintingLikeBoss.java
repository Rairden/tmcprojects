public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        while (amount > 0) {
            System.out.print("*");
            amount--;
        }
        System.out.println();
    }

    public static void printWhitespaces(int amount) {
        while (amount > 0) {
            System.out.print(" ");
            amount--;
        }
    }

    public static void printTriangle(int size) {
        // use ONLY printStars() and printWhitespaces()
        // do not print anything here, only call the methods.  use the helper methods.
        int white = size;
        white--;
        for (int i = 1; i < size+1; i++) {
           printWhitespaces(white);
           printStars(i);
           white--;
        }
    }

    public static void xmasTree(int height) {
        // use ONLY printStars() and printWhitespaces()
        // -1 whitespace (h - 1).   +2 stars.  on each row.

        int white = height - 2;
        int size = 1;
        int cnt = 1;

        for (int i = 0; i != height; i++) {
            printWhitespaces(height - cnt);
            printStars(size);
            size += 2;
            cnt += 1;
        }
        printWhitespaces(white);
        printStars(3);
        printWhitespaces(white);
        printStars(3);
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(4);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}


