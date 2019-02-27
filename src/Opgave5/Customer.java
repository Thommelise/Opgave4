package Opgave5;

public class Customer {
Bar bar =new Bar();
public void removeBeer () throws InterruptedException {
    if (bar.beers.size()>0)
    {
        bar.beers.remove(1);

    }
    else
        System.out.println("no more Beer");
        Thread.sleep(3000);
}
}
