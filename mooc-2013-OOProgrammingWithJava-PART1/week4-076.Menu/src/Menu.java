import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu {
    /** In this assignment, we will implement a class Menu that holds information about meals that are available in a cafeteria.
     * Menu objects store the information of meals using an object variable of type ArrayList<String>
     *
     * Exercise 76.1: Adding a meal to menu
     * Implement the method public void addMeal(String meal) that adds a new meal to the list this.meals of a Menu
     * object. If the meal is already in the list, it should not be added.
     *
     * Exercise 76.2: Printing the menu
     * Implement the method public void printMeals() that prints the meals in a menu. As an example, the output after
     * three additions could be:
     *
     * Hamburger
     * Fish'n'Chips
     * Sauerkraut
     *
     * Exercise 76.3: Clearing a menu
     * Implement the method public void clearMenu() that clears a menu. After calling this method, the menu should be
     * empty. Class ArrayList has a method that is useful here. Within your method body write meals. and see how
     * NetBeans helps you by showing the available methods.
     */

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    // add the methods here
    public void addMeal(String meal) {
            if (meals.contains(meal)) {
                // do nothing; don't add duplicates
            } else {
                meals.add(meal);
            }
    }

    public void printMeals() {
        for (String x : meals) {
            System.out.println(x);
        }
    }

    public void clearMenu() {
        int i = meals.size() - 1;
        while (!meals.isEmpty()) {
            meals.remove(i);
            i--;
        }

/*      // this works
        Iterator<String> i = meals.iterator();
        while (i.hasNext()) {
            String s = i.next(); // must be called before you can call i.remove()
            // Do something
            i.remove();
        }
*/
/*      // this wont work; java.util.ConcurrentModificationException
        for (String x : meals) {
              meals.remove(x);
        }
*/
    }
}















