package org.example.hw1.Menu;

public abstract class MenuItem {
    private String itemName;

    public MenuItem(String itemName) {
        this.itemName = itemName;
    }
    public abstract void processItem();

    public String getItemName() {
        return itemName;
    }
}

