package se.su.ovning1;

import java.util.ArrayList;

public class Order {
    final ArrayList<Item> itemsList = new ArrayList<>();
    final long orderNumber;
    static long counter;
    // ta in valfrit antal Items och lägga till i listan.
    public Order(Item... item) {
        addItemsToList(item);
        this.orderNumber = counter;
        counter++;
    }

    private void addItemsToList(Item... items) {
        for(Item item : items) {
            if(item != null) {
                itemsList.add(item);
            }
        }
    }




}
