package com.example;

/**
 * 
 * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
 * методы. Реализовать в java.
 */
import java.util.ArrayList;
import java.util.List;

public class laptop {

    private List<Brand> brands;

    private String model = null;
    private float diagonal;
    private String screenResolution;
    private boolean dvdRom;
    private int hardDisk;
    private String operativeMemory;
    private String operatingSystem;
    private String color = null;

    public laptop() {
    }

    public laptop(String model, float diagonal, String screenResolution, boolean dvdRom, int hardDisk,
            String operativeMemory, String operatingSystem, String color) {
        this.brands = new ArrayList<>();
        this.model = model;
        this.diagonal = diagonal;
        this.screenResolution = screenResolution;
        this.dvdRom = dvdRom;
        this.hardDisk = hardDisk;
        this.operativeMemory = operativeMemory;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public float getDiagonal() {
        return diagonal;
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    public boolean isDvdRom() {
        return dvdRom;
    }

    public int getHardDisk() {
        return hardDisk;
    }

    public String getOperativeMemory() {
        return operativeMemory;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getColor() {
        return color;
    }

    public void addBrand(Brand brand) {
        brands.add(brand);
    }
}
