/*
* File: UseQueue.java
* Author: Dayna Eidle
* Course: CMPT 220
* Assignment: Lab 7 - Problem 1
* Due Date: 4/27/2017
* Version: 1.8
*/

public class UseQueue{
  public static void main(String[]args){
    Queue q1 = new Queue();
    
    for (int i = 1; i <= 20; i++){
      q1.enqueue(i);
    }
    
    while (q1.empty() == false){
      System.out.print(q1.dequeue() + " ");
    }
    
    System.out.println();
  }
}