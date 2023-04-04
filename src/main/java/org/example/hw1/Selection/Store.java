package org.example.hw1.Selection;

import java.util.Map;
import java.util.Set;

public interface Store {
    void addToStore(Product item);
    Set<Product> findAtStore(Map<String, Object> criterium);
    void popFromStore(Product item);
}
