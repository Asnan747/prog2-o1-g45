package se.su.ovning1;

public class CompactDisc extends Recording {



    //KOnstruktor
    public CompactDisc(String artist, int year, int condition, double price) {
        super(artist, year, condition, price);
    }

    public String getType() {
        return "LP-skiva";
    }
}
