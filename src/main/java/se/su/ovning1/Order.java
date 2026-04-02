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

    //addera price för varje item i Lista och returnera värdet
    public double getTotalValue() {
        double totalValue = 0;
        for(Item item: itemsList) {
            totalValue+=item.getPrice();
        }

        return totalValue;
    }

    // total pris med moms
    public double getTotalValuePlusVAT() {
        double totalPrice = 0;
        for (Item item : itemsList) {
            totalPrice += item.getPriceWithVAT();
        }

        return totalPrice;
    }

    public String getReceipt() {
        return "Receipt";
    }




}
