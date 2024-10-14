package pakett1;

public class boxrun {
    public static void main(String[] args) {
        box box = new box(10);  // Create a box with a maximum weight of 10 kg

        box.add(new book("Fedor Dostojevski", "Crime and Punishment", 2.0));
        box.add(new book("Robert Martin", "Clean Code", 1.0));
        box.add(new book("Kent Beck", "Test Driven Development", 0.7));

        box.add(new cd("Pink Floyd", "Dark Side of the Moon", 1973));
        box.add(new cd("Wigwam", "Nuclear Nightclub", 1975));
        box.add(new cd("Rendezvous Park", "Closer to Being Here", 2012));

        System.out.println(box);
    }
}
