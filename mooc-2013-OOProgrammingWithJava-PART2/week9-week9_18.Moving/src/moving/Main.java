package moving;

import moving.domain.Item;
import moving.domain.Thing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Thing item = new Item("toothbrash", 2);
        System.out.println(item);
        System.out.println();

        List items = new ArrayList();
        items.add(new Item("passport", 2));
        items.add(new Item("toothbrash", 1));
        items.add(new Item("circular saw", 100));

        Collections.sort(items);
        System.out.println(items);
        System.out.println();



    }
}