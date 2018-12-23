public class BinarySearch {
    public static boolean search(int[] array, int searchedValue) {
        int beginning       = 0;
        int end             = array.length - 1;
        int maxIterations   = howManyTimesHalvable(array.length);
        int cnt             = 0;

        while (beginning <= end) {
            int middle = (beginning + end) / 2;
            if (array[middle] == searchedValue) { return true; }
            if (cnt == maxIterations) { return false; }

            // restrict the search area
            if (searchedValue < array[middle]) {
                end = middle;
                cnt++;
            } else {
                beginning = middle;
                cnt++;
                if (beginning + 1 == end) {
                    beginning++;
                }
            }
        }
        return false;
    }

    // a helper method:
    public static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value
        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }
}