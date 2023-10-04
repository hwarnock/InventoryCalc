package InventoryCalc.models;

import jakarta.persistence.GeneratedValue;

public class InvItem {
    @GeneratedValue
    private Long id;
    private Long itemCost;
    private String itemName;

    public InvItem(Long itemCost, String itemName) {
        this.itemCost = itemCost;
        this.itemName = itemName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getItemCost() {
        return itemCost;
    }

    public void setItemCost(Long itemCost) {
        this.itemCost = itemCost;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
