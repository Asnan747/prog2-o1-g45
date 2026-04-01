package se.su.ovning1;

public abstract class Recording {

    //Variabler
    private String artist;
    private int year;
    private int condition;
    private double price;

    //Konstruktor
    public Recording(String artist, int year, int condition, double price) {
        this.artist = artist;
        this.year = year;
        this.condition = condition;
        this.price = price;
    }

    //Metoder
    public String getArtist() {
        return artist;
    }

    public int getCondition() {
        return condition;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

}
