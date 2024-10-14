package pakett1;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class box implements ToBeStored {
    private double maxWeigth;
    private ArrayList<ToBeStored> things;

    public box(double maxWeigth) {
        this.maxWeigth = maxWeigth;
        this.things = new ArrayList<>();
    }

    public void add(ToBeStored thing) {

        if (thing == this) {
            System.out.println("You cannot add a box to itself");
            return;
        }

        if (currentWeight() + thing.weigth() <= maxWeigth) {
            things.add(thing);
        } else {
            System.out.println("Item too heavy to be added to the box!");
        }
    }

    public double currentWeight() {
        double totalWeight = 0;
        for (ToBeStored thing : things) {
            totalWeight += thing.weigth();
        }
        return totalWeight;
    }

    @Override
    public double weigth() {
        return currentWeight();
    }
    @Override
    public String toString() {
        return "Box: " + things.size() + " things, total weight " + currentWeight() + " kg";
    }



}
