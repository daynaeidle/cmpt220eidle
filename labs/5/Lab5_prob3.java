/*
* File: Lab5_prob3.java
* Author: Dayna Eidle
* Course: CMPT 220
* Assignment: Lab 5
* Due Date: 3/30/2017
* Version: 1.8
*/

import java.util.Scanner;
import java.util.Arrays.*;
import java.util.ArrayList;
import java.util.List;

public class Lab5_prob3{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter list: ");
    int len = input.nextInt();
    
    int [] myList = new int[len];
    
    for (int i = 0; i < myList.length; i++){
      myList[i] = input.nextInt();
    }
    
    int [] newList = new int[myList.length];
    newList = partition(myList);
    System.out.print("After the partition, the list is: ");
    for (int x = 0; x < myList.length; x++){
      System.out.print(newList[x] + " ");
    }
    
    System.out.println();
    
  }
  
  public static int[] partition(int[] list){
    int partValue = list[0];
    int partLoc = 0;
    int [] newList = new int[list.length];
    
    //adding smaller numbers to list
    for (int i = 1; i < list.length; i++){
      if (list[i] <= partValue){
        newList[partLoc + 1] = partValue;
        newList[partLoc] = list[i];
        partLoc++;
      }
    }
    int grtSpots = 0;
    for (int i = 1; i < list.length; i++){
      if (list[i] > partValue){
        grtSpots++;
        newList[list.length - grtSpots] = list[i];   
      }
    }

    return newList;
  }
}