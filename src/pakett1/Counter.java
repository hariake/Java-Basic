package pakett1;

public class Counter {
    private int count;
    private boolean check;

    public Counter(int startingValue, boolean check) {
        this.count = startingValue;
        this.check = check;
    }
    public Counter(int startingValue) {
        this(startingValue, false);
    }
    public Counter(boolean check) {
        this(0, check);
    }
    public Counter() {
        this(0, false);
    }

    public  int value() {
        return this.count;
    }
    public void increase(){
        this.count++;
    }
    public void decrease(){
        this.count--;
    }
    public void increaseBy(int increaseAmount){
        this.count += increaseAmount;
    }
    public void decreaseBy(int decreaseAmount){
        if( this.check && this.count== 0){
            return;
        }
        this.count -= decreaseAmount;
    }

    public static void main(String[] args) {
        Counter counter1 = new Counter(10, true);
        counter1.decrease();
        System.out.println("Counter1 value: " + counter1.value());
        counter1.decrease();
        System.out.println("Counter1 value: " + counter1.value());

        Counter counter2 = new Counter(5);
        counter2.increase();
        System.out.println("Counter2 value: " + counter2.value());

        Counter counter3 = new Counter(true);
        counter3.increase();
        System.out.println("counter3 value: " + counter3.value());

        Counter counter4 = new Counter();
        counter4.increase();
        System.out.println("counter4 value: " + counter4.value());

        Counter counter5 = new Counter();
        counter5.increaseBy(12);
        System.out.println("counter5 value: " + counter5.value());

        Counter counter6 = new Counter();
        counter6.decreaseBy(12);
        System.out.println("counter6 value: " + counter6.value());

    }

}
