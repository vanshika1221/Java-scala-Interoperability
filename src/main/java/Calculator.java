package com.knoldus;
public class Calculator {
    // method to add elements
    public static int addElements(int firstElement, int secondElement) {
        return firstElement + secondElement;
    }
    // method to subtract elements
    public static int subtractElements(int firstElement, int secondElement) {
        return firstElement - secondElement;
    }
    // method to multiply elements
    public static int multiplyElements(int firstElement, int secondElement) {
        return firstElement * secondElement;
    }
    // method to divide elements
    public static int divideElements(int firstElement, int secondElement) {
        if (secondElement == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return firstElement / secondElement;
    }
}
