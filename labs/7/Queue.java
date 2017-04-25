/*
* File: Queue.java
* Author: Dayna Eidle
* Course: CMPT 220
* Assignment: Lab 7 - Problem 10.10
* Due Date: 4/27/2017
* Version: 1.8
*/

import java.util.ArrayList.*;
import java.util.List.*;

public class Queue{
  private int[] elements;
  private int size;
  public static final int DEFAULT_CAPACITY = 8;
   
  public Queue(){
    elements = new int[DEFAULT_CAPACITY];
  }
   
  public void enqueue(int v){
    if (size >= elements.length){
      int temp [] = new int[elements.length * 2];
      System.arraycopy(elements, 0, temp, 0, elements.length);
      elements = temp;
    }
    elements[size++] = v;
  }
   
  public int dequeue(){
    int v = elements[0];
    int temp [] = new int[elements.length];
    System.arraycopy(elements, 1, temp, 0, size);
    elements = temp;
    size--;
    return v;
  }
   
  public boolean empty(){
    return size == 0;
  }
   
  public int getSize(){
    return size;
  }
}

/*
***************************
*          Queue          *
***************************
* -elements: int[]        *
* -size: int              *
***************************
* +Queue()                *
* +enqueue(v: int)        *
* +dequeue(x: int): int   *
* +empty(): boolean       *
* +getSize(): int         *
***************************
*/