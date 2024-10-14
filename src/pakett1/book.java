package pakett1;

public class book implements ToBeStored {
    private String bookname;
    private String author;
    private double weigth;

    public book(String bookname, String author, Double weigth) {
        this.bookname = bookname;
        this.author = author;
        this.weigth = weigth;
    }

    @Override
    public double weigth() {
        return this.weigth;
    }

    @Override
    public String toString() {
        return this.author + ": " + this.bookname;
    }
}
