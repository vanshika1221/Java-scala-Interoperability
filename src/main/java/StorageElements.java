package com.knoldus;
public class StorageElements {
    // array to store elements
    private int[] storeElements;
    // defining the capacity of store elements array
    public StorageElements(int capacityOfArray) {
        storeElements = new int[capacityOfArray];
    }
    public void addElement(int element) {
            for (int i = 0; i < storeElements.length; i++) {
                if(storeElements[i] == 0) {
                    storeElements[i] = element;
                    return;
                }
            }
        throw new IllegalStateException("Array is full");
    }
    public boolean removeElement(int element) {
        for (int i = 0; i < storeElements.length; i++) {
            if (storeElements[i] == (element)) {
                storeElements[i] = 0;
                return true;
            }
        }
        return false;
    }
    public void removeAll() {
        storeElements = new int[storeElements.length];
    }
    public boolean checkIfContains(int element) {
        for (int i = 0; i < storeElements.length; i++) {
            if (storeElements[i] != 0 && storeElements[i] == (element)) {
                return true;
            }
        }
        return false;
    }
}

