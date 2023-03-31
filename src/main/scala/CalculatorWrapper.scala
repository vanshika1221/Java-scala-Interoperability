package com.knoldus

//  Created a class CalculatorWrapper which serves as a wrapper for a Calculator class.
//  The CalculatorWrapper class provides four methods : add, subtract, multiply, and divide.
class CalculatorWrapper {
    def add(firstElement: Int, secondElement: Int): Int = {
      Calculator.addElements(firstElement, secondElement)
    }
    def subtract(firstElement: Int, secondElement: Int): Int = {
      Calculator.subtractElements(firstElement, secondElement)
    }
    def multiply(firstElement: Int, secondElement: Int): Int = {
      Calculator.multiplyElements(firstElement, secondElement)
    }
    def divide(firstElement: Int, secondElement: Int): Int = {
      Calculator.divideElements(firstElement, secondElement)
    }
}
