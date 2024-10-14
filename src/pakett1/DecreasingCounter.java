package pakett1;

public class DecreasingCounter {
    private int value;

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        this.value--;
    }
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(15);
        counter.printValue();
        counter.decrease();
        counter.printValue();
        counter.decrease();
        counter.printValue();

    }
}




