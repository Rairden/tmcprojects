import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] vals1 = {6, 5, 8, 7, 11};
        System.out.println("smallest: " + smallest(vals1));

        // indexes:    0  1  2  3   4
        int[] vals2 = {6, 5, 8, 7, 11};
        System.out.println("Index of the smallest: " + indexOfTheSmallest(vals2));
        printLine();

        // indexes:     0  1  2  3   4
        int[] vals3 = {-1, 6, 9, 8, 12};
        System.out.println(indexOfTheSmallestStartingFrom(vals3, 1));
        System.out.println(indexOfTheSmallestStartingFrom(vals3, 2));
        System.out.println(indexOfTheSmallestStartingFrom(vals3, 4));
        printLine();

        // swapping indexes
        int[] vals4 = {3, 2, 5, 4, 8};
        System.out.println( Arrays.toString(vals4) );

        swap(vals4, 1, 0);
        System.out.println( Arrays.toString(vals4) );

        swap(vals4, 0, 3);
        System.out.println( Arrays.toString(vals4) );
        printLine();

        // indexes:    0  1  2  3  4  5  6
        int[] vals5 = {8, 3, 7, 9, 1, 2, 4};

        System.out.println(Arrays.toString(vals5) + " start");

        sort(vals5);

    }

    static void printLine() {
        System.out.println("--------------------------------");
    }

    public static int smallest(int[] arr) {
        int smallest = arr[0];
        for (int i : arr) {
            if (i < smallest) {
                smallest = i;
            }
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] arr) {
        int cnt = 0;
        int smallest = smallest(arr);
        for (int i : arr) {
            if (i == smallest) {
                break;
            }
            cnt++;
        }
        return cnt;
    }

    public static int indexOfTheSmallestStartingFrom(int[] arr, int index) {
        int cnt = 0;
        int smallest = 0;
        int smallestIndex = 0;
        for (int i = index; i < arr.length; i++) {
            if (cnt == 0) {
                smallest = arr[i];
                cnt++;
                continue;
            }
            if (arr[i] <= smallest) {
                smallest = arr[i];
                smallestIndex = cnt;
            }
            cnt++;
        }
        return index + smallestIndex;
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp    = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void sort(int[] arr) {
        int indexSmall  = indexOfTheSmallest(arr);

        for (int i = 0; i < arr.length; i++) {
            swap(arr, i, indexSmall);
            System.out.println(Arrays.toString(arr));
            indexSmall = indexOfTheSmallestStartingFrom(arr, i + 1);
        }
    }


}