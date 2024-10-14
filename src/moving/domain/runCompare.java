package moving.domain;


import moving.domain.Item;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class runCompare {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item("passport", 2));
        items.add(new Item("toothbrush", 1));
        items.add(new Item("circular saw", 100));

        // Sort items by volume
        Collections.sort(items);

        // Print sorted items
        System.out.println(items);
    }
}
