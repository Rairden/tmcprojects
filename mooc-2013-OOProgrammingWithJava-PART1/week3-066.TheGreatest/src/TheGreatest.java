import java.util.ArrayList;

public class TheGreatest {
    /**
     * Create the method greatest, which receives a list of numbers (ArrayList<Integer>) as a parameter
     * and then returns the greatest number in the list as a return value.
     *
     * The greatest number is: 7
     */

    public static int greatest(ArrayList<Integer> list) {
        // write code here
        int first = list.get(0);
        for (int x : list) {
            if (x > first){
                first = x;
            }
        }
        return first;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(2);
        
        System.out.println("The greatest number is: " + greatest(lista));
    }
}
