package com.ibm.core.java.lab4.ex3;

public abstract class Item {

    private int id;
    private String title;
    private int numberOfCopies;

    public Item(int id, String title, int numberOfCopies) {
        this.id = id;
        this.title = title;
        this.numberOfCopies = numberOfCopies;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    public void checkIn() {
        numberOfCopies++;
    }

    public void checkOut() {
        if (numberOfCopies > 0) {
            numberOfCopies--;
        }
    }

    public void addItem(int copies) {
        numberOfCopies += copies;
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Item) {
            Item item = (Item) obj;
            return this.id == item.id;
        }
        return false;
    }

    @Override
    public String toString() {
        return "ID=" + id +
               ", Title=" + title +
               ", Copies=" + numberOfCopies;
    }
}