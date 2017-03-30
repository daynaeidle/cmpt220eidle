/*
* File: Lab5_prob1.java
* Author: Dayna Eidle
* Course: CMPT 220
* Assignment: Lab 5
* Due Date: 3/30/2017
* Version: 1.8
*/

import java.util.Scanner;

public class Lab5_prob1{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
    double [] numList = new double[10];
    
    for (int i = 0; i < numList.length; i++){
      numList[i] = input.nextDouble();
    }
    
    double[] newList = selectionSort(numList);
    
    for (int x = 0; x < newList.length; x++){
      System.out.print(newList[x] + " ");
    }
    
    System.out.println();
  }
  
  public static double[]selectionSort(double [] list){
    for (int i = list.length-1; i >= 0; i--){
      double currentMax = list[i];
      int currentMaxIdx = i;
      
      for (int j = i - 1; j >= 0; j--){
        if (currentMax < list[j]){
          currentMax = list[j];
          currentMaxIdx = j;
        
        }
      }
      
      if (currentMaxIdx != i){
        list[currentMaxIdx] = list[i];
        list[i] = currentMax;
	  }
    }
    
    return list; 
  }
}