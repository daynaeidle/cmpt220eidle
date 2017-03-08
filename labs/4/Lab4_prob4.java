/*
* File: Lab4_prob4.java
* Author: Dayna Eidle
* Course: CMPT 220
* Assignment: Lab 4
* Due Date: 3/9/17
* Version: 1.8
*/

import java.util.Scanner;

public class Lab4_prob4{
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    double [] numbers = new double[10];
    
    System.out.println("Enter in 10 doubles");
    
    for (int i = 0; i < numbers.length; i++){
      numbers[i] = input.nextDouble();
    }
    
    for (int l = 0; l < numbers.length; l++){
      for (int k = 0; k < numbers.length-1; k++){
        if (numbers[k] > numbers[k+1])
          sort(numbers, k, k+1);
      }
    }
    
    for (int j=0; j < numbers.length; j++){
      System.out.print(numbers[j] + " ");
    }
    
    System.out.println();
  }
  

  static void sort(double arr[], int idx1, int idx2){
    double temp = arr[idx1];
    arr[idx1] = arr[idx2];
    arr[idx2] = temp;
  }
  
  
}