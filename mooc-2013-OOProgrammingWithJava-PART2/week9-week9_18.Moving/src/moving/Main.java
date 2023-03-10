package moving;

import moving.domain.Box;
import moving.domain.Item;
import moving.domain.Thing;
import moving.logic.Packer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Thing item = new Item("toothbrash", 2);
        System.out.println(item);
        printLine();    // -------------------------------------

        List items = new ArrayList();
        items.add(new Item("passport", 2));
        items.add(new Item("toothbrash", 1));
        items.add(new Item("circular saw", 100));

        Collections.sort(items);
        System.out.println(items);
        printLine();    // -------------------------------------

        // the things we want to pack
        List things = new ArrayList();
        things.add(new Item("passport", 2));
        things.add(new Item("toothbrash", 1));
        things.add(new Item("book", 4));
        things.add(new Item("circular saw", 8));

        // we create a packer which uses boxes whose volume is 10
        Packer packer = new Packer(10);

        // we ask our packer to pack things into boxes
        List<Box> boxes = packer.packThings(things);

        System.out.println("number of boxes: " + boxes.size());

        for (Box box : boxes) {
            System.out.println("  things in the box: " + box.getVolume() + " dm^3");
        }

    }

    private static void printLine() {
        System.out.println("--------------------------------------------");
    }
}