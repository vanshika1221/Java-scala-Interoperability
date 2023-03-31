package com.knoldus
import org.scalatest.funsuite.AnyFunSuite

class StorageElementsTest extends AnyFunSuite {
  val calculatorObject = new CalculatorWrapper
  val storageObject = new StorageWrapper

  test("To perform add Operation") {
    assert(calculatorObject.add(12, 9) == 21)
  }
  test("To perform subtraction Operation") {
    assert(calculatorObject.subtract(12, 9) == 3)
  }
  test("To perform multiply Operation") {
    assert(calculatorObject.multiply(2, 9) == 18)
  }
  test("To perform divide Operation") {
    assert(calculatorObject.divide(12, 3) == 4)
  }
  test("To perform add element Operation in storage array") {
    storageObject.addElement(87)
    storageObject.addElement(45)
    storageObject.addElement(67)
    assert(storageObject.checkIfContains(87) == true)
  }
  test("To perform remove element Operation in storage array") {
    storageObject.removeElement(87)
    assert(storageObject.checkIfContains(87) == false)
  }
}
