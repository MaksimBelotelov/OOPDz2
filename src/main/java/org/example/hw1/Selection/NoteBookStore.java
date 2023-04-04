package org.example.hw1.Selection;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NoteBookStore extends ProductStore{
    @Override
    public Set<Product> findAtStore(Map<String, Object> criterium) {
        Set<Product> filtered = new HashSet<>();

        if(criterium.isEmpty())
            filtered = getProducts().keySet();
        else {
            System.out.println("Выбраны фильтры: " + criterium.entrySet());
            for (Product notebook : this.getProducts().keySet()) {
                if ((((Notebook) notebook).getScreenSize() >=
                        (double) criterium.getOrDefault("screenSize", 0.0)) &&
                        (((Notebook) notebook).getMemory() >=
                                (int) criterium.getOrDefault("memory", 0)) &&
                        (((Notebook) notebook).getHdd() >=
                                (int) criterium.getOrDefault("hdd", 0)) &&
                        (((String) criterium.getOrDefault("os", "windows linux no")).
                                contains(((Notebook) notebook).getOperationSystem()))) {
                    filtered.add(notebook);
                }
            }
        }
        return filtered;
    }
}
