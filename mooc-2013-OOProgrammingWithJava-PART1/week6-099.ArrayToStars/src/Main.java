
public class Main {

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {
        for (int i : array) {
            printStar(i);
        }
    }

    static void printStar(int num) {
        int i = 0;
        while (i < num) {
            System.out.print("*");
            i++;
        }
        System.out.println();
    }

}
