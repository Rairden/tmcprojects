
public class Main {

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        int cnt = 0;
        for (int x : array) {
            if (cnt < array.length - 1) {
                System.out.print(x + ", ");
                cnt++;
            } else {
                System.out.print(x);
            }
        }
    }
}