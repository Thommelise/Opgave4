package opgave4;

public class CounterDecrementer implements Runnable {

    private int updates;
    private Counter counter;

    public CounterDecrementer(Counter counter, int updates) {
        this.counter = counter;
        this.updates = updates;
    }

    @Override
    public void run() {

        for (int i = 0; i <= updates; ++i) {
        //while(true){
            if (counter.getValue() <= counter.getMin()) {
                try {
                    Thread.sleep(100);
                    //System.out.println("countin zero");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else {
                counter.decrement();
            }
        }
    }
    //System.out.println(counter.getValue());
}


