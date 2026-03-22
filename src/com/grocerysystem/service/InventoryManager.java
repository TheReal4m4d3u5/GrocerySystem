package com.grocerysystem.service;


import java.util.HashMap;
import java.util.Map;

import com.grocerysystem.model.Product;


public class InventoryManager {

    private Map<Product, Integer> stock;

    public InventoryManager() {
        stock = new HashMap<>();
    }

    public void addProduct(Product product, int quantity) {
        stock.put(product, quantity);
    }

    public void addInventory(Product product, int quantity) {
        int currentQuantity = stock.getOrDefault(product, 0);
        stock.put(product, currentQuantity + quantity);
    }

    public boolean hasEnoughStock(Product product, int quantity) {
        return stock.getOrDefault(product, 0) >= quantity;
    }

    public boolean purchaseProduct(Product product, int quantity) {
        if (!hasEnoughStock(product, quantity)) {
            return false;
        }

        int currentQuantity = stock.get(product);
        stock.put(product, currentQuantity - quantity);
        return true;
    }

    public int getStock(Product product) {
        return stock.getOrDefault(product, 0);
    }

    public void listInventory() {
        for (Map.Entry<Product, Integer> entry : stock.entrySet()) {
            System.out.println(entry.getKey() + ", stock=" + entry.getValue());
        }
    }
	
}
