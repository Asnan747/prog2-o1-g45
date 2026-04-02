package se.su.ovning1;

import java.util.ArrayList;

public class Order {
    ArrayList<Item[]> items = new ArrayList<>();
    // ta in valfrit antal Items och lägga till i listan.
    public Order(Item... item) {
        items.add(item);
    }


}
