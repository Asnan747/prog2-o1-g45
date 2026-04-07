package se.su.ovning1;
import java.time.LocalDate;

public class LongPlay extends Recording{
    public LongPlay(String name, String artist, int year, int condition, double price)  {
        super(name,artist, year,condition,price);
    }


    public String getType() {
        return "LP";
    }

    @Override
    public double getPrice() {
        double basePrice = getOriginalPrice() * (getCondition() / 10.0);
        double ageIncrease = (getCurrentYear() - getYear()) * 5;

        double total = basePrice + ageIncrease;

        return Math.max(10, total);
    }

    // metod för att få nuvarande året.
    private int getCurrentYear() {
        return LocalDate.now().getYear();
    }
}


