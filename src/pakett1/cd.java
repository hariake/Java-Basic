package pakett1;

public class cd implements ToBeStored{
    private String artist;
    private String title;
    private int publishingYear;
    private final double cdWeigth = 0.1;

    public cd (String artist, String title, int publishingYear) {
        this.artist = artist;
        this.title = title;
        this.publishingYear = publishingYear;
    }

    @Override
    public double weigth(){
        return cdWeigth;
    }

    @Override
    public String toString() {
        return this.artist + " " + this.title + " " + this.publishingYear;
    }
}
