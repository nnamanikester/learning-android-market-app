package org.x3codes.marketapp;

public class Item {
    private final int itemImage;
    private final String itemName, itemDesc;

    public Item(int itemImage, String itemName, String itemDesc) {
        this.itemImage = itemImage;
        this.itemName = itemName;
        this.itemDesc = itemDesc;
    }

    public int getItemImage() {
        return itemImage;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemDesc() {
        return itemDesc;
    }
}
