package moving.domain;


import java.util.Objects;

public class Item implements Thing, Comparable<Item> {
    private String name;
    private int volume;

    public Item(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return name + " (" + volume + " dm^3)" ;
    }

    @Override
    public int compareTo(Item other) {
        return Integer.compare(this.volume, other.volume);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Item item = (Item) obj;
        return volume == item.volume && Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, volume);
    }
}
