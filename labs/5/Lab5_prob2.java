/*
* File: Lab5_prob2.java
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

public class Lab5_prob2{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
    int len1;
    int len2;
    
    //list 1 components
    System.out.print("Enter list1: ");
    len1 = input.nextInt();
    int [] list1 = new int[len1];
    for (int i = 0; i < list1.length; i++){
      list1[i] = input.nextInt();
    }
    //list2 components
    System.out.print("Enter list2: ");
    len2 = input.nextInt();
    int [] list2 = new int[len2];
    for (int j = 0; j < list2.length; j++){
      list2[j] = input.nextInt();
    }
    int [] newList = new int[list1.length + list2.length];
    newList = merge(list1, list2);
    
    for (int k = 0; k < newList.length; k++){
    System.out.print(newList[k] + " ");
    }
    System.out.println();
  }
  
  public static int[] merge(int[] list1, int[] list2){
  
    int [] newList = new int[list1.length + list2.length];
    int x;
    
    //adding list1 elements
    for (x = 0; x < list1.length; x++){
        newList[x] = list1[x];
    }
    
    //adding list2 elements
    int y = 0;
    for (int b = x; b < newList.length; b++){
      newList[b] = list2[y];
      y++;
    }
    
    java.util.Arrays.sort(newList);
    return newList; 
  }
}