package se.su.ovning1;

public abstract class Recording extends Item implements PriceableWithVAT25{

    //Variabler
    private String name;
    private String artist;
    private int year;
    private int condition;
    private double price;

    //Konstruktor
    public Recording(String name, String artist, int year, int condition, double price) {
        super(name);
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
        double newPrice = price * ((double)condition / 10);
        //Den får inte gå under 10
        if (newPrice < 10) {
            return 10;
        }
        return newPrice;
    }

    public int getYear() {
        return year;
    }

    //Tom abstract getType metod enligt instruktioner, antar att den ska implementeras CompactDisc och LongPlay
    public abstract String getType();

}

