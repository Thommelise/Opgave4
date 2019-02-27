package Opgave5;



public class Bartender {

    Bar bar = new Bar();
    Beer beer = new Beer();

    public void bartender() throws InterruptedException {

        if (bar.beers.size() < 20) {
            bar.beers.add(beer);
        } else {
            System.out.println("filled up");
            Thread.sleep(1000);
        }
    }
}


