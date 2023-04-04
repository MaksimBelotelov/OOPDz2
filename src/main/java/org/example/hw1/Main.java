package org.example.hw1;

import org.example.hw1.Menu.MenuContainer;
import org.example.hw1.Selection.NoteBookStore;
import org.example.hw1.Selection.Notebook;

public class Main {
    public static void main(String[] args) {
        NoteBookStore noteBookStore = new NoteBookStore();

        noteBookStore.addToStore(new Notebook("Laptop15", 14000, "Asus",
               15.6, 4, 1000, "windows"));
        noteBookStore.addToStore(new Notebook("Laptop14", 12000, "Asus",
               14.0, 4, 128, "no"));
        noteBookStore.addToStore(new Notebook("Extensa15", 14500, "Acer",
               15.6, 4, 128, "linux"));
        noteBookStore.addToStore(new Notebook("250G7", 15000, "HP",
               15.6, 4, 128, "no"));
        noteBookStore.addToStore(new Notebook("Aspire3", 20000, "Acer",
               17.3, 8, 256, "windows"));
        noteBookStore.addToStore(new Notebook("Vivobook", 25000, "Asus",
               16.0, 16, 512, "windows"));

        MenuContainer mainMenu = new MenuContainer(noteBookStore);

        System.out.println("\nДобро пожаловать!\nВыберите критерии для подбора ноутбука.");
        mainMenu.start();
    }
}
