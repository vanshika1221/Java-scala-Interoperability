package com.knoldus

// The Storage trait defines four methods that a class implementing the trait should provide
trait Storage {
  def addElement(element: Int): Unit
  def removeElement(element: Int): Unit
  def removeAll(): Unit
  def checkIfContains(element: Int): Boolean
}

// The StorageWrapper class implements the Storage trait and provides implementations for each of the four methods.
class StorageWrapper extends Storage {
  private val storageElementsObject = new StorageElements(10)

  //The addElement method adds an element to the storage by calling the addElement method of the storageElementsObject instance.
  override def addElement(element: Int) = {
    storageElementsObject.addElement(element)
    println(s"Element $element added successfully")
  }

  //The removeElement method removes an element from the storage
  override def removeElement(elementToRemove: Int): Unit = {
    if (storageElementsObject.removeElement(elementToRemove)) {
      println(s"Element $elementToRemove removed successfully")
    }
    else println(s"Element $elementToRemove not found")
  }

  // The removeAll method removes all elements from the storage
  override def removeAll(): Unit = {
    storageElementsObject.removeAll()
    println("All elements removed successfully")
  }

  // The checkIfContains method checks if the storage contains an element
  override def checkIfContains(elementToCheck: Int): Boolean = {
    storageElementsObject.checkIfContains(elementToCheck)
  }
}
