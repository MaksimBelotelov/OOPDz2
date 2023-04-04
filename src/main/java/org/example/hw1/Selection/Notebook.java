package org.example.hw1.Selection;

public class Notebook extends Product{
    private String manufacturer;
    private double screenSize;
    private int memory;
    private int hdd;
    private String operationSystem;

    public Notebook(String name, double price, String manufacturer,
                    double screenSize, int memory, int hdd, String operationSystem) {
        super(name, price);
        this.manufacturer = manufacturer;
        this.screenSize = screenSize;
        this.memory = memory;
        this.hdd = hdd;
        this.operationSystem = operationSystem;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public int getMemory() {
        return memory;
    }

    public int getHdd() {
        return hdd;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    @Override
    public String toString() {
        return  manufacturer + "\\" + name + "\\" + screenSize + "\\RAM:" +
                memory + "Gb\\HDD:" + hdd + "Gb\\OS:" + operationSystem +
                "   цена: " + super.price;
    }
}
