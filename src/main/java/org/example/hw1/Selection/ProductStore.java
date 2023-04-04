package org.example.hw1.Selection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public abstract class ProductStore implements Store{
    private Map<Product, Integer> products;

    public ProductStore() {
        this.products = new HashMap<>();
    }

    @Override
    public void addToStore(Product item) {
        Integer amount = products.get(item);
        products.put(item, amount == null ? 1 : amount + 1);
        System.out.println("На склад добавлен " + item.getName());
    }

    public void popFromStore(Product item) {
        if(products.containsKey(item)) {
            products.put(item, products.get(item) - 1);
            System.out.println("Товар " + item + " извлечен из склада.");
            if(products.get(item) == 0)
                products.remove(item);
        }
        else {
            System.out.println("Товара " + item + " нет на складе");
        }
    }
    @Override
    public abstract Set<Product> findAtStore(Map<String, Object> criterium);

    public Map<Product, Integer> getProducts() {
        return products;
    }
}
