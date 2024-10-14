package moving.domain;

import moving.domain.Item;
import moving.domain.Thing;

public class runThing {
    public static void main(String[] args) {
        Thing item = new Item("toothbrush", 2);
        System.out.println(item);  // Should print: toothbrush (2 dm^3)
    }
}
