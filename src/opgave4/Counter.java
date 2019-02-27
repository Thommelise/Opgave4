package opgave4;

public class Counter {

    private long value;
    private long max;
    private long min;

    private final int update = 1000;
    private int currentUpdate = 0;

    public Counter(long min, long max) {
        this.min = min;
        this.max = max;
        value = 10000;

    }

    public synchronized void increment() {

        if (value <= max) {
            value++;
            notifyAll();
            outputCount();
        }
    }


    public synchronized void decrement() {

        if (value >= min) {
            value--;
            //notifyAll();
            outputCount();
        }

    }


    public long getValue() {
        return value;
    }

    public long getMax() {
        return max;
    }

    public long getMin() {
        return min;
    }

    public void outputCount(){
        if (currentUpdate % update == 0) {
            System.out.println(value + ": " + Thread.currentThread().getName());
            currentUpdate = 0;
        }
        currentUpdate++;
    }




}
