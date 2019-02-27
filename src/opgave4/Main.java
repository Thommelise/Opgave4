package opgave4;

import Opgave5.Bar;

public class Main {

    public static void main(String[] args) throws InterruptedException {
     /*   int count = 25000;

        Counter counter = new Counter(0, count);

        Thread decrement1 = new Thread(new CounterDecrementer(counter, count));
        //Thread decrement2 = new Thread(new CounterDecrementer(counter, count));
        //Thread increment1 = new Thread(new CounterIncrementer(counter, count));
        Thread increment2 = new Thread(new CounterIncrementer(counter, count));

        //increment1.start();
        //increment2.start();
        decrement1.start();
        //decrement2.start();
        //increment1.join();

        increment2.join();
        decrement1.join();
        //decrement2.join();
        */

        Bar bar = new Bar();

        Thread bar1 =new Thread(new Bar());

    }


}
