/*
* File: Lab4_prob3.java
* Author: Dayna Eidle
* Course: CMPT 220
* Assignment: Lab 4
* Due Date: 3/9/17
* Version: 1.8
*/

import java.util.Scanner;

public class Lab4_prob3{
  public static void main(String[] args){
  
    Scanner input = new Scanner(System.in);
    
    double [] numbers = new double[10];
    
    System.out.println("Enter in 10 numbers");
    
    for (int i = 0; i < numbers.length; i++){
      numbers[i] = input.nextDouble();
    }
    
    System.out.println("The minimum number in this array is: " +
      min(numbers));
  }
  
  public static double min(double[] array){
  
    double min = array[0];
  
    for (int k = 1; k < array.length; k++){
      if (array[k] < min)
        min = array[k];
    }
    
    return min;
  }
}