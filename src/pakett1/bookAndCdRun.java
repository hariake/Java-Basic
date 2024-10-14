package pakett1;

public class bookAndCdRun {
    public static void main(String[] args) {
        book book1 = new book("Fedor Dostojevski", "Crime and Punishment",2.0);
        book book2 = new book("Robert Martin", "Clean Code",1.3);
        book book3 = new book("Kent Beck", "Test Driven Development", 0.5);

        cd cd1 = new cd("Pink Floyd", "Dark Side of the Moon", 1973);
        cd cd2 = new cd("Wigwam", "Nuclear Nightclub", 1975);
        cd cd3 = new cd("Rendezvous Park", "Closer to Being Here", 2012);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(cd1);
        System.out.println(cd2);
        System.out.println(cd3);
    }
}
