package se.su.ovning1;
import java.time.LocalDate;

public class LongPlay extends Recording{
    public LongPlay(String name, String artist, int year, int condition, double price)  {
        super(name,artist, year,condition,price);
    }


    public String getType() {
        return "LP";
    }

    public double getPrice() {
        double newPrice = super.getPrice() + (getCurrentYear() - super.getYear()) * 5.0;
        return newPrice;
    }

    // metod för att få nuvarande året.
    private int getCurrentYear() {
        LocalDate currentDate = LocalDate.now();
        return currentDate.getYear();
    }

}


