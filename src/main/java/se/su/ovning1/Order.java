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

    // metod för att lägga Item i listan.
    private void addItemsToList(Item... items) {
        for(Item item : items) {
            if(item != null) {
                itemsList.add(item);
            }
        }
    }

    public double getTotalValue() {
      return 0.04;
    }

    public double getTotalValuePlusVAT() {
        return 00.3;
    }

    public String getReceipt() {
        return "Receipt";
    }




}
