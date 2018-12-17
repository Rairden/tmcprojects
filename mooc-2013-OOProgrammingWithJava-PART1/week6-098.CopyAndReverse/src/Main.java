import java.util.Arrays;

public class Main {

    public static int[] copy(int[] array) {
        int[] arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i];
        }
        return arr;
    }

    public static int[] reverseCopy(int[] array) {
        int[] arr = new int[array.length];
        int k = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            arr[k] = array[i];
            k++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);

        // change the copied
        copied[0] = 99;

        // print both
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("copied: " + Arrays.toString(copied));

        // 98.2 ################################################################
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("reversed: " + Arrays.toString(reverse));
    }
}