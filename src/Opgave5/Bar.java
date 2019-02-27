package Opgave5;

import java.util.ArrayList;

public class Bar {

    ArrayList<Beer> beers = new ArrayList(20);

    public void placeBeer(Beer b) throws InterruptedException {

        if (beers.size() < 20) {

            Thread.sleep(1000);
        } else {
            beers.add(b);

        }

    }

    public void takeBeer() {
        if (beers.size() > 0) {

            beers.remove(1);

        } else {
            System.out.println("no more beers");
        }


    }
}