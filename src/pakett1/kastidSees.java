package pakett1;

public class kastidSees {
    public static void main(String[] args) {
        // Create a big box with a maximum weight of 10 kg
        box bigBox = new box(10);

        // Create a smaller box with a maximum weight of 5 kg
        box smallBox = new box(5);

        // Add books and CDs to the smaller box
        smallBox.add(new book("Fedor Dostojevski", "Crime and Punishment", 2.0));
        smallBox.add(new cd("Pink Floyd", "Dark Side of the Moon", 1973));

        // Add smaller box into the big box
        bigBox.add(smallBox);

        // Add another book directly to the big box
        bigBox.add(new book("Robert Martin", "Clean Code", 1.3));

        // Try to add the big box into itself (this should be prevented)
        bigBox.add(bigBox);

        // Output the contents of the boxes
        System.out.println(bigBox);
    }
}
