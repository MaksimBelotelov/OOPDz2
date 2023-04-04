package org.example.hw1.Menu;

import org.example.hw1.Selection.Notebook;
import org.example.hw1.Selection.Product;
import org.example.hw1.Selection.ProductStore;

import java.util.*;

public class MenuContainer {
    private List<MenuItem> menuItems = new ArrayList();
    private Scanner input = new Scanner(System.in);
    private Map<String, Object> filterMap = new HashMap<>();

    /**
     * Конструктор заполняет пункты меню и имплементирует методы для случая выбора этого пункта меню.
     */

    public MenuContainer(ProductStore store) {
        menuItems.add(new MenuItem("Диагональ экрана") {
            @Override
            public void processItem() {
                System.out.println("Введите минимальную диагональ экрана в дюймах: ");
                filterMap.put("screenSize", input.nextDouble());
            }
        });

        menuItems.add(new MenuItem("Оперативная память") {
            @Override
            public void processItem() {
                System.out.println("Введите минимальный объем оперативной памяти(Гб): ");
                filterMap.put("memory", input.nextInt());
            }
        });

        menuItems.add(new MenuItem("Объем жесткого диска") {
            @Override
            public void processItem() {
                System.out.println("Введите минимальный объем жесткого диска(Гб): ");
                filterMap.put("hdd", input.nextInt());
            }
        });

        menuItems.add(new MenuItem("Операционная система") {
            @Override
            public void processItem() {
                System.out.print("Введите ОС (windows, linux или no) :");
                input.nextLine();
                filterMap.put("os", input.nextLine().toLowerCase());
            }
        });

        menuItems.add(new MenuItem("Вывести результаты отбора") {
            @Override
            public void processItem() {
                for(Product notebook : store.findAtStore(filterMap)){
                    System.out.println(notebook);
                }
            }
        });

        menuItems.add(new MenuItem("Сбросить все фильтры") {
            @Override
            public void processItem() {
                System.out.println("\nКритерии отбора сброшены.");
                filterMap.clear();
            }
        });

        menuItems.add(new MenuItem("Выход") {
            @Override
            public void processItem() {
                System.out.println("\nДо свидания!");
                System.exit(0);
            }
        });
    }

    /**
     * Метод выводит на экран меню и принимает пользовательский ввод до тех пор, пока пользователь не выберет "Выход"
     */
    public void start() {
        while(true){
            printMenuTitle();
            int choice = input.nextInt();
            if(choice < menuItems.size())
                menuItems.get(choice).processItem();
            else
                System.out.println("Incorrect input! Необходимо вести цифру от 0 до " + (menuItems.size()-1) + "\n");
        }
    }

    /**
     * Метод для вывода на экран пунктов меню.
     */
    public void printMenuTitle() {
        for(int i = 0; i < menuItems.size(); i++){
            System.out.println(i + ". " + menuItems.get(i).getItemName());
        }
    }
}
