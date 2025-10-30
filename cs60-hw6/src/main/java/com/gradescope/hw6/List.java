package com.gradescope.hw6;

import java.util.NoSuchElementException;

/**
 * A singly-linked list in which each element references the next element.
 * 
 * @param <E> the type of element to store in this list (must be comparable)
 * 
 * @author HMC CS 60 Instructors
 * @version Fall 2025
 */
public class List<E extends Comparable<E>> {
  /** The first node of this list. */
  private ListNode head;

  /** The number of nodes in this list. */
  private int size;

  /**
   * Constructs an empty list.
   */
  public List() {
    this.head = null;
    this.size = 0;
  }

  /**
   * A node in a list that contains data and references the next node.
   */
  private class ListNode {
    /** The data stored by this node. */
    private E data;

    /** The next node in this list (or {@code null} if this is end). */
    private ListNode next;

    /**
     * Initializes a list node with the provided data and next element.
     * 
     * @param data the data to store
     * @param next the next list node
     */
    private ListNode(E data, ListNode next) {
      this.data = data;
      this.next = next;
    }

    /**
     * Initializes a list node with the provided data and a {@code null} next
     * element (making this the end of the list).
     * 
     * @param data the data to store
     */
    private ListNode(E data) {
      this(data, null);
    }

    /*
     * BONUS: Why don't we need get methods in this private inner class?
     */
  }

  // ----- METHODS ALREADY PROVIDED -----

  /**
   * Returns the number of elements in this list.
   * 
   * @return the number of elements in this list
   */
  public int size() {
    return this.size;
  }

  /**
   * Returns {@code true} if this list contains no elements.
   * 
   * @return {@code true} if this collection contains no elements
   */
  public boolean isEmpty() {
    return this.size() == 0;
  }

  /**
   * Returns a string representation of this list.
   * 
   * <p>
   * The string representation consists of the list's elements in order,
   * separated by a space. Elements are converted to a {@link String} type using
   * the {@link Object#toString()} method.
   * 
   * @return a string representation of this list
   * @see Object#toString()
   */
  @Override
  public String toString() {
    String result = "( ";
    ListNode node = this.head;

    while (node != null) {
      result = result + node.data + " ";
      node = node.next;
    }

    return result + ")";
  }

  /**
   * Returns {@code true} if this list contains the specified element.
   * 
   * <p>
   * More formally, if {@code o == null}, this list returns {@code true} if and
   * only if this list contains at least one {@code null} element. Otherwise,
   * this list returns {@code true} if and only if this list contains at least
   * one element {@code e} such that {@code o.equals(e)}.
   * 
   * @param o element whose presence in this list is to be tested
   * @return {@code true} if this list contains the specified element
   * 
   * @see Object#equals(Object)
   */
  public boolean contains(E o) {
    ListNode node = this.head;

    if (o == null) {
      while (node != null) {
        if (null == node.data) {
          return true;
        }

        node = node.next;
      }
    } else {
      while (node != null) {
        if (o.equals(node.data)) {
          return true;
        }

        node = node.next;
      }
    }

    return false;
  }

  /**
   * Compares the specified object with this list for equality.
   * 
   * <p>
   * Returns {@code true} if and only if the specified object is also a list,
   * both lists have the same size, and all corresponding pairs of elements in
   * the two lists are equal. In other words, two lists are defined to be equal
   * if they contain the same elements in the same order.
   * 
   * @param o the object to be compared for equality with this list
   * @return {@code true} if the specified object is equal to this list
   */
  @Override
  public boolean equals(Object o) {
    /*
     * @CS60: You do not need to understand the code in this method, but feel
     * free to take a look and ask questions about it, if you are interested!
     */

    // if o is not of type List, they are not equal
    if (!(o instanceof List)) {
      return false;
    }

    // cast the object to a List and use the overloaded version of equals
    @SuppressWarnings("unchecked")
    List<E> other = (List<E>) o;

    // if the two lists are different sizes, they are not equal
    if (this.size != other.size) {
      return false;
    }

    // compare element by element
    ListNode node1 = this.head;
    ListNode node2 = other.head;

    for (int i = 0; i < this.size; i++) {
      // get the two strings, so we can compare them
      E s1 = node1.data;
      E s2 = node2.data;

      if (s1 == null) { // check if must use == comparison
        if (s1 != s2) {
          return false;
        }
      } else { // otherwise use .equals comparison
        if (!s1.equals(s2)) {
          return false;
        }
      }

      node1 = node1.next; // walk down this list
      node2 = node2.next; // walk down other list
    }

    return true;
  }

  /**
   * Returns the element at the specified position in this list.
   * 
   * @param index index of the element to return
   * @return the element at the specified position in this list
   * @throws IndexOutOfBoundsException if the index is out of range
   *                                   ({@code index < 0 || index >= size()})
   */
  public E get(int index) throws IndexOutOfBoundsException {
    // check that index is within the bounds of the list
    if (index < 0) {
      throw new IndexOutOfBoundsException("Index must be at least 0.");
    }
    if (index >= this.size()) {
      throw new IndexOutOfBoundsException("Index is out of bounds.");
    }

    // iterate through the list and find the right node
    int currentIndex = 0;
    ListNode currentNode = this.head;

    while (currentIndex != index) {
      currentIndex++;
      currentNode = currentNode.next;
    }

    return currentNode.data;
  }

  // ----- METHODS FOR ADDING -----

  /**
   * Inserts the specified element at the beginning of this list.
   * 
   * Note that the list is modified. Nothing is returned. It is different than
   * the constructor, which does create a new list.
   * 
   * @param e the element to add
   */
  public void addFirst(E e) {
    ListNode newNode = new ListNode(e, this.head); 
    this.head = newNode;
    this.size++;
  }

  /**
   * Adds the specified element to the end of this list.
   * 
   * <p>
   * Note that the list is modified. Nothing is returned. It is different than
   * the constructor, which does create a new list.
   * 
   * @param e element to be added to the end of this list
   */
  public void addLast(E e) {
    ListNode newNode = new ListNode(e); 
    ListNode node = this.head; 
    // if empty, add to front 
    if(node == null){
      this.head = newNode;
    }
    else {
        while (node.next != null){
        node = node.next;
    }
      node.next = newNode; 
    } 
    this.size++;

    /*
     * NOTE: If this list is empty, this method adds e to this list. If this
     * list is not empty, this method searches to find the last ListNode in this
     * list, then adds a new ListNode, containing e, beyond it as the final
     * element.
     */
  }

  /**
   * Appends all of the elements in the other list to the end of this list, in
   * the order that they are stored by the other list.
   * 
   * <p>
   * This operation is in-place. Note that the other list should not be modified
   * while the operation is in progress. (This will occur if the specified
   * collection is this list, and it is nonempty.)
   * 
   * @param other list containing elements to be added to this list
   */
  public void addAll(List<E> other){
    if (other.head == null){
      return;
    }
    ListNode node = other.head; 
    while (node != null){ 
      //call add Last to add term
      this.addLast(node.data);
      node = node.next;
      }
    }

  

  // ----- METHODS TO REMOVE OR MOVE -----

  /**
   * Removes and returns the first element from this list.
   * 
   * @return the first element from this list
   * @throws NoSuchElementException if this list is empty
   */
  public E removeFirst() throws NoSuchElementException {
    if (this.head == null) {
      throw new NoSuchElementException();   
    }
    E first = this.head.data;
    this.head = this.head.next;
    this.size--; // keep size in sync
    return first; 
  }

  /**
   * Removes the first element from this list and adds it at the beginning of
   * the other list.
   * 
   * @param other the list to which to move the element
   * @throws NoSuchElementException if this list is empty
   */
  public void moveFirstTo(List<E> other) throws NoSuchElementException {
    if (this.head == null){
      throw new NoSuchElementException();
    }
    ListNode first = this.head; 
    this.head = this.head.next; 
    this.size--;

    // move to other head
    first.next = other.head; 
    other.head = first; 
    other.size ++; 


    // NOTE: Do this without creating a new ListNode instance (meaning you
    // cannot use addFirst).
  }

  // ----- METHODS TO CONVERT TYPES -----

  /**
   * Constructs a list containing containing the elements of the string array,
   * in the same order.
   * 
   * This static method can be thought of as another constructor.
   * 
   * @param original the array whose elements are to be placed into this list
   * 
   * @return a new list with the elements from original in the same order
   */
  public static List<String> asList(String[] original) {
    // create new list 
    List<String> newList = new List<>(); 
    for (int i = original.length - 1; i >= 0; i--) {
      // add original[i] using helper 
      newList.addFirst(original[i]);
    }
    return newList;

    /*
     * Note: Use addFirst, **not** addLast. addFirst takes constant time whereas
     * addLast takes time proportional to the size of the list. This
     * implementation will allow you to add all elements to your list in time
     * proportional to original.length.
     */
  }

  /**
   * Returns an array containing all of the elements in this list in proper
   * sequence (from first to last element). Non-null elements are converted to
   * strings by object.toString().
   * 
   * @return an array containing all of the elements in this list in proper
   *         sequence
   */
  public String[] toArray() {
    //new array w size (list size)
    String[] array = new String[this.size];
    int counter = 0;
    // start from first
    ListNode node = this.head; 
    while (node != null) {
      // add element converted to string
      array[counter] = (node.data == null) ? null : node.data.toString();
      node = node.next;
      counter++;
    }
    return array;
}

  // ----- METHODS USEFUL FOR MERGE SORT -----

  /**
   * Reverses the elements of this list.
   * 
   * This operation is in-place.
   */
  public void reverse() {
    ListNode previous = null; 
    ListNode current = this.head; 
    ListNode next;

    while (current != null){ 
      // flip direction 
      next = current.next; 
      current.next = previous; 
      // move onto next
      previous = current;
      current = next;
    }
    this.head = previous;

    /*
     * NOTE: We recommend creating ListNode references to refer to the previous,
     * current, and next ListNode as you "walk" the list...
     */
  }

  /**
   * Splits this list in two.
   * 
   * Afterwards, this list contains only elements from the first half, and the
   * returned list contains only elements from the second half.
   * 
   * If this list has an odd number of elements, afterwards, it should contain
   * one more element than the list that is returned. If this list has no or one
   * element, it is unmodified, and an empty list is returned.
   * 
   * @return a new list that contains the second half of the elements in the
   *         original list
   */
  public List<E> split() {
    if (this.size <= 1) {
      return new List<E>();
    }

    int half = this.size / 2; 
    int steps = this.size - half - 1; // node before cut

    ListNode node = this.head; 
    for (int i = 0; i < steps; i++){
      node = node.next;
    }

    // set new head and split 
    ListNode newList = node.next; 
    node.next = null;

    // create new list 
    List<E> other = new List<E>(); 
    other.head = newList;
    other.size = half; 
    this.size = this.size - half;

    return other;
  }

  /**
   * Merges this list with the other list.
   * 
   * Both this list and other list should already be in sorted order.
   * 
   * This method will modify this list and the other list. When completed, other
   * should be empty and this list should contain all elements in sorted order.
   * 
   * @param other the list to be merged with this list
   * 
   * @throws NullPointerException if the lists contain any {@code null} values
   * 
   * @see Comparable#compareTo(Object)
   * @see #moveFirstTo(List)
   * @see #reverse()
   */
  public void merge(List<E> other) throws NullPointerException {
    // if other is empty, stop
    if (other == null || other.size == 0) return;

    // if this is empty, take all from other
    if (this.size == 0) {
      this.head = other.head;
      this.size = other.size;
      other.head = null;
      other.size = 0;
      return;
    }

    List<E> merged = new List<>();

    // move smaller heads to merged
    while (!this.isEmpty() && !other.isEmpty()) {
      if (this.head.data.compareTo(other.head.data) <= 0) {
        this.moveFirstTo(merged);
      } else {
        other.moveFirstTo(merged);
      }
    }

    // move leftovers
    while (!this.isEmpty()) this.moveFirstTo(merged);
    while (!other.isEmpty()) other.moveFirstTo(merged);

    // fix order and update
    merged.reverse();
    this.head = merged.head;
    this.size = merged.size;
  }

  /**
   * Sorts this list using merge sort.
   * 
   * @throws NullPointerException if the list contains any {@code null} values
   * 
   * @see #split()
   * @see #merge(List)
   */
  public void mergeSort() throws NullPointerException {
    if (this.size <= 1) return;

    List<E> second = this.split();
    this.mergeSort();
    second.mergeSort();
    this.merge(second);

    // NOTE: Use split() and merge(List other)!
  }

  /**
   * Demonstrates this class.
   * 
   * @param args unused
   */
  public static void main(String[] args) {
    System.out.println("Add code here to test your List implementation!");
    System.out.println("Also, look at the assignment for debugging tips.");

    // For example, you might start like this:
    // List<String> list = new List<String>();
    // System.out.println(list.head.data);
  }
}
