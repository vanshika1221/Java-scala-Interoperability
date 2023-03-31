package com.knoldus

object Driver extends App {
  // creating objects of calculator and storage wrapper class of scala which contains java classes by importing
  val calculatorObject = new CalculatorWrapper
  val storageObject = new StorageWrapper

  println(calculatorObject.add(2, 9))
  println(calculatorObject.subtract(15, 2))
  println(calculatorObject.multiply(4, 8))
  println(calculatorObject.divide(90, 5))

  //adding elements in storage element array
  storageObject.addElement(87)
  storageObject.addElement(45)
  storageObject.addElement(67)

  println("Element 34 is present or not - " + storageObject.checkIfContains(34))
  storageObject.removeElement(87)
  // after removing 87, checking again whether it is present or not
  println("Element 87 is present or not - " + storageObject.checkIfContains(87))
  storageObject.removeAll()

}